package androidx.ui.foundation.diagnostics

import androidx.ui.toStringAsFixed

/**
 * Property describing a [Float] [value] with an optional [unit] of measurement.
 *
 * Numeric formatting is optimized for debug message readability.
 */
open class FloatProperty protected constructor(
    name: String,
    value: Float? = null,
    computeValue: ComputePropertyValueCallback<Float?>? = null,
    ifNull: String? = null,
    unit: String? = null,
    showName: Boolean = true,
    defaultValue: Any? = kNoDefaultValue,
    tooltip: String? = null,
    level: DiagnosticLevel = DiagnosticLevel.info
) : _NumProperty<Float>(
        name = name,
        value = value,
        computeValue = computeValue,
        ifNull = ifNull,
        unit = unit,
        tooltip = tooltip,
        defaultValue = defaultValue,
        showName = showName,
        level = level
) {

    companion object {

        /**
         * If specified, [unit] describes the unit for the [value] (e.g. px).
         *
         * The [showName] and [level] arguments must not be null.
         */
        fun create(
            name: String,
            value: Float? = null,
            ifNull: String? = null,
            unit: String? = null,
            showName: Boolean = true,
            defaultValue: Any? = kNoDefaultValue,
            tooltip: String? = null,
            level: DiagnosticLevel = DiagnosticLevel.info
        ): FloatProperty {
            return FloatProperty(
                    name = name,
                    value = value,
                    ifNull = ifNull,
                    unit = unit,
                    showName = showName,
                    defaultValue = defaultValue,
                    tooltip = tooltip,
                    level = level
            )
        }

        /**
         * Property with a [value] that is computed only when needed.
         *
         * Use if computing the property [value] may throw an exception or is
         * expensive.
         *
         * The [showName] and [level] arguments must not be null.
         */
        fun createLazy(
            name: String,
            computeValue: ComputePropertyValueCallback<Float?>,
            ifNull: String? = null,
            unit: String? = null,
            showName: Boolean = true,
            defaultValue: Any = kNoDefaultValue,
            tooltip: String? = null,
            level: DiagnosticLevel = DiagnosticLevel.info
        ): FloatProperty {
            return FloatProperty(
                    name = name,
                    computeValue = computeValue,
                    ifNull = ifNull,
                    unit = unit,
                    showName = showName,
                    defaultValue = defaultValue,
                    tooltip = tooltip,
                    level = level
            )
        }
    }

    override fun numberToString() = getValue()?.toStringAsFixed(1).orEmpty()
}