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

package com.hrules.gitego.data.repository.datasources.api.specifications;

import com.hrules.gitego.data.network.NetworkHelper;
import com.hrules.gitego.data.network.RequestNetwork;
import com.hrules.gitego.domain.specifications.GetAuthRepoSubscribersSpecification;

public class AuthRepoSubscribersAPIGetAuthRepoSubscribersSpecification
    extends GetAuthRepoSubscribersSpecification<RequestNetwork> {
  @Override public RequestNetwork get() {
    String access_token = (String) getAdditionalParams()[0];
    String subscribers_url = (String) getAdditionalParams()[1];
    return new RequestNetwork(subscribers_url, NetworkHelper.makeAuthorizationHeader(access_token),
        null);
  }
}
