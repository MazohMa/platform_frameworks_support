/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.material.demos

import android.util.Log
import androidx.ui.core.CraneWrapper
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.MaterialTheme
import androidx.ui.painting.Image
import androidx.compose.Composable
import androidx.compose.composer

@Composable
fun FloatingActionButtonDemo(icon: Image) {
    CraneWrapper {
        MaterialTheme {
            Center {
                val onClick: () -> Unit = { Log.e("FABDemo", "onClick") }
                Column(mainAxisAlignment = MainAxisAlignment.SpaceEvenly) {
                    FloatingActionButton(icon = icon, onClick = onClick)
                    FloatingActionButton(text = "EXTENDED", onClick = onClick)
                    FloatingActionButton(icon = icon, text = "ADD TO FAVS", onClick = onClick)
                }
            }
        }
    }
}
