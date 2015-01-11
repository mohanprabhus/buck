/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.apple;

import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.coercer.Either;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;

import org.immutables.value.Value;

/**
 * Parameters that can affect how tests are linked and bundled.
 *
 * Tests with the same parameters should be able to be linked and bundled into a single executable.
 */
@Value.Immutable(prehash = true)
public abstract class AppleTestBundleParamsKey {
  public abstract Optional<SourcePath> infoPlist();
  public abstract Either<AppleBundleExtension, String> extension();
  public abstract Optional<ImmutableSortedMap<String, ImmutableMap<String, String>>> configs();

  public static AppleTestBundleParamsKey fromAppleTestDescriptionArg(AppleTestDescription.Arg arg) {
    return ImmutableAppleTestBundleParamsKey.builder()
        .infoPlist(arg.infoPlist)
        .configs(arg.configs)
        .extension(arg.extension)
        .build();
  }
}
