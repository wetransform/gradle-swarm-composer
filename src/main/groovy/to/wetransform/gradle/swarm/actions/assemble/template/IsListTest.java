/*
 * Copyright 2021 wetransform GmbH
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

package to.wetransform.gradle.swarm.actions.assemble.template;

import java.util.List;
import java.util.Map;

import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.extension.Test;
import com.mitchellbosecke.pebble.template.EvaluationContext;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

/**
 * Simple tests to check if an input is a list.
 *
 * @author Simon Templer
 */
public class IsListTest implements Test {

  @Override
  public List<String> getArgumentNames() {
    return null;
  }

  @Override
  public boolean apply(Object input, Map<String, Object> args, PebbleTemplate self, EvaluationContext context,
      int lineNumber) throws PebbleException {
    return input instanceof List;
  }

}
