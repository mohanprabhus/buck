/*
 * Copyright 2015-present Facebook, Inc.
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

package com.facebook.buck.parser;

import com.facebook.buck.core.model.UnconfiguredBuildTarget;
import com.facebook.buck.core.parser.buildtargetparser.BuildTargetPatternParser;
import java.nio.file.Path;

public class BuildTargetPatternTargetNodeParser extends BuildTargetPatternParser<TargetNodeSpec> {

  @Override
  public TargetNodeSpec createForDescendants(Path cellPath, Path basePath) {
    return ImmutableTargetNodePredicateSpec.of(
        BuildFileSpec.fromRecursivePath(cellPath.resolve(basePath), cellPath));
  }

  @Override
  public TargetNodeSpec createForChildren(Path cellPath, Path basePath) {
    return ImmutableTargetNodePredicateSpec.of(
        BuildFileSpec.fromPath(cellPath.resolve(basePath), cellPath));
  }

  @Override
  public TargetNodeSpec createForSingleton(UnconfiguredBuildTarget target) {
    return BuildTargetSpec.from(target);
  }
}
