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

package org.openqa.selenium.buck.file;

import com.facebook.buck.core.description.arg.CommonDescriptionArg;
import com.facebook.buck.core.description.arg.HasSrcs;
import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.core.model.targetgraph.BuildRuleCreationContextWithTargetGraph;
import com.facebook.buck.core.model.targetgraph.DescriptionWithTargetGraph;
import com.facebook.buck.core.rules.BuildRule;
import com.facebook.buck.core.rules.BuildRuleParams;
import com.facebook.buck.core.rules.SourcePathRuleFinder;
import com.facebook.buck.core.util.immutables.BuckStyleImmutable;
import java.util.Optional;
import org.immutables.value.Value;

public class FolderDescription implements DescriptionWithTargetGraph<FolderArg> {

  @Override
  public Class<FolderArg> getConstructorArgType() {
    return FolderArg.class;
  }

  @Override
  public BuildRule createBuildRule(
      BuildRuleCreationContextWithTargetGraph context,
      BuildTarget buildTarget,
      BuildRuleParams params,
      FolderArg args) {
    return new Folder(
        buildTarget,
        context.getProjectFilesystem(),
        new SourcePathRuleFinder(context.getActionGraphBuilder()),
        args.getOut().orElse(buildTarget.getShortName()),
        args.getSrcs());
  }

  @BuckStyleImmutable
  @Value.Immutable
  interface AbstractFolderArg extends CommonDescriptionArg, HasSrcs {
    Optional<String> getOut();
  }
}
