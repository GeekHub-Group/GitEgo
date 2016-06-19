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

package com.hrules.gitego.domain.models.transformers;

import android.support.annotation.NonNull;
import com.hrules.gitego.data.persistence.database.DatabaseConstants;
import com.hrules.gitego.domain.models.GitHubAuthUserDto;
import com.hrules.gitego.domain.models.transformers.base.Transformer;
import java.util.HashMap;
import java.util.Map;

public class GitHubAuthUserDtoToMap implements Transformer<GitHubAuthUserDto, Map<String, Object>> {
  @Override public Map<String, Object> transform(@NonNull GitHubAuthUserDto from) {
    Map<String, Object> values = new HashMap<>();
    values.put(DatabaseConstants.KEY_USER_DATE, from.getDate());
    values.put(DatabaseConstants.KEY_USER_LOGIN, from.getLogin());
    values.put(DatabaseConstants.KEY_USER_AVATAR_URL, from.getAvatar_url());
    values.put(DatabaseConstants.KEY_USER_HTML_URL, from.getHtml_url());
    values.put(DatabaseConstants.KEY_USER_TYPE, from.getType());
    values.put(DatabaseConstants.KEY_USER_NAME, from.getName());
    values.put(DatabaseConstants.KEY_USER_FOLLOWERS, from.getFollowers());
    return values;
  }
}
