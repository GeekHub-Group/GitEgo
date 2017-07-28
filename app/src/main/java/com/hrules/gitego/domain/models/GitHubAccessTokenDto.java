/*
 * Copyright (c) 2017. Héctor de Isidro - hrules6872
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

package com.hrules.gitego.domain.models;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

public final class GitHubAccessTokenDto {
  @SerializedName("access_token") private final String access_token;

  @SerializedName("token_type") private final String token_type;

  @SerializedName("scope") private final String scope;

  public GitHubAccessTokenDto(@NonNull String access_token, @NonNull String token_type, @NonNull String scope) {
    this.access_token = access_token;
    this.token_type = token_type;
    this.scope = scope;
  }

  public @NonNull String getAccess_token() {
    return access_token;
  }

  public @NonNull String getToken_type() {
    return token_type;
  }

  public @NonNull String getScope() {
    return scope;
  }
}
