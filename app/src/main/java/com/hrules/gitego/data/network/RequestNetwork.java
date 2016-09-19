/*
 * Copyright (c) 2016. Héctor de Isidro - hrules6872
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

package com.hrules.gitego.data.network;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Map;

public class RequestNetwork {
  private final String url;
  private final Map<String, String> mapHeaders;
  private final java.util.Map<String, String> mapParams;

  public RequestNetwork(@NonNull String url, @Nullable Map<String, String> mapHeaders, Map<String, String> mapParams) {
    this.url = url;
    this.mapHeaders = mapHeaders;
    this.mapParams = mapParams;
  }

  String getUrl() {
    return url;
  }

  Map<String, String> getMapHeaders() {
    return mapHeaders;
  }

  Map<String, String> getMapParams() {
    return mapParams;
  }
}
