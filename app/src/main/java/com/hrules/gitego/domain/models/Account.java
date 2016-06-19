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

package com.hrules.gitego.domain.models;

import com.google.gson.annotations.SerializedName;

public class Account {
  @SerializedName("user") private final String user;

  @SerializedName("type") private final String type;

  @SerializedName("token") private final String token;

  @SerializedName("defaultUser") private boolean defaultUser;

  public Account(String user, String type, String token, boolean defaultUser) {
    this.user = user;
    this.type = type;
    this.token = token;
    this.defaultUser = defaultUser;
  }

  public String getUser() {
    return user;
  }

  public String getType() {
    return type;
  }

  public String getToken() {
    return token;
  }

  public boolean isDefaultUser() {
    return defaultUser;
  }

  public void setDefaultUser(boolean defaultUser) {
    this.defaultUser = defaultUser;
  }
}
