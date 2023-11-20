/*
 * Copyright (C) 2019. Zac Sweers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package catchup.app.service

import android.content.Context
import android.net.Uri
import androidx.annotation.ColorInt
import androidx.compose.runtime.Immutable

@Immutable
data class UrlMeta(
  val uri: Uri?,
  @ColorInt val accentColor: Int,
  val context: Context,
) {

  constructor(
    url: String?,
    @ColorInt accentColor: Int,
    context: Context,
  ) : this(if (url.isNullOrBlank()) null else Uri.parse(url), accentColor, context)
}