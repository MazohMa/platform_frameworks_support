package androidx.ui.engine.text

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TextPositionTest {

    @Test
    fun `toString with empty combined`() {
        val textPosition = TextPosition(1, TextAffinity.downstream)
        assertThat(
            textPosition.toString(),
            `is`(equalTo("TextPosition(offset: 1, affinity: ${TextAffinity.downstream})"))
        )
    }
}