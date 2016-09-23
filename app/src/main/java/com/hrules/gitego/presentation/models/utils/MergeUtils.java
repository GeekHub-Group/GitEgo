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

package com.hrules.gitego.presentation.models.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.hrules.gitego.presentation.models.GitHubAuthRepo;
import com.hrules.gitego.presentation.models.GitHubAuthUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeUtils {
  public List<GitHubAuthRepo> mergeAuthRepoItems(@NonNull List<GitHubAuthRepo> list) {
    Map<String, GitHubAuthRepo> map = new HashMap<>();
    for (GitHubAuthRepo item : list) {
      if (!TextUtils.isEmpty(item.getName())) {
        GitHubAuthRepo itemInMap = map.get(item.getName());
        if (itemInMap != null) {
          if (itemInMap.getDate().equalsIgnoreCase(itemInMap.getGitHubAuthRepoOlder().getDate())) {
            itemInMap.setGitHubAuthRepoOlder(item);
          }
        } else {
          item.setGitHubAuthRepoOlder(item);
          map.put(item.getName(), item);
        }
      }
    }
    return new ArrayList<>(map.values());
  }

  public GitHubAuthUser mergeAuthUserItems(@NonNull List<GitHubAuthUser> list) {
    Map<String, GitHubAuthUser> map = new HashMap<>();
    for (GitHubAuthUser item : list) {
      if (!TextUtils.isEmpty(item.getLogin())) {
        GitHubAuthUser itemInMap = map.get(item.getLogin());
        if (itemInMap != null) {
          if (itemInMap.getDate().equalsIgnoreCase(itemInMap.getGitHubAuthUserOlder().getDate())) {
            itemInMap.setGitHubAuthUserOlder(item);
          }
        } else {
          item.setGitHubAuthUserOlder(item);
          map.put(item.getLogin(), item);
        }
      }
    }
    return map.entrySet().iterator().next().getValue();
  }
}
