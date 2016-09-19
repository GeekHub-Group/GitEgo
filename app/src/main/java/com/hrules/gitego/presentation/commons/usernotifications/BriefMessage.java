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

package com.hrules.gitego.presentation.commons.usernotifications;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.view.View;

public class BriefMessage {
  public void showLong(@NonNull View view, @NonNull String message) {
    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
  }

  public void showShort(@NonNull View view, @NonNull String message) {
    Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
  }

  public void showActionIndefinite(@NonNull View view, @NonNull String message, @NonNull String action,
      @NonNull final BriefMessageListener listener) {
    Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setAction(action, new View.OnClickListener() {
      @Override public void onClick(View v) {
        listener.onClick();
      }
    }).show();
  }
}
