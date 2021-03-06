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

package com.hrules.gitego.data.repository.datasources.api.specifications;

import android.support.annotation.NonNull;
import com.hrules.gitego.data.network.NetworkHelper;
import com.hrules.gitego.data.network.RequestNetwork;
import com.hrules.gitego.data.repository.datasources.api.AuthRepoAPIDataSourceReadable;
import com.hrules.gitego.domain.api.GitHubAPI;
import com.hrules.gitego.domain.specifications.GetAuthRepoSpecification;
import com.hrules.gitego.domain.specifications.params.GetAuthRepoSpecificationParams;

public final class AuthRepoAPIGetAuthRepoSpecification extends GetAuthRepoSpecification<RequestNetwork> {
  @NonNull @Override public Class getParent() {
    return AuthRepoAPIDataSourceReadable.class;
  }

  @Override public RequestNetwork get() {
    GetAuthRepoSpecificationParams params = (GetAuthRepoSpecificationParams) getParams();

    String access_token = params.getAccess_token();
    return new RequestNetwork(GitHubAPI.GITHUB_GET_AUTHREPO_URL, NetworkHelper.makeAuthorizationHeader(access_token),
        null);
  }
}
