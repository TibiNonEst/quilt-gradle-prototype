/*
 * Copyright 2023 QuiltMC
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

package org.quiltmc.gradle.base.api;

import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.SourceSet;

import java.util.function.Consumer;

public interface QuiltGradleExtension {
	static QuiltGradleExtension get(Project project) {
		return project.getExtensions().getByType(QuiltGradleExtension.class);
	}

	DirectoryProperty getProjectCache();
	DirectoryProperty getGlobalCache();
	DirectoryProperty getProjectRepo();
	DirectoryProperty getGlobalRepo();

	/**
	 * Registers a consumer to be run in every source set after evaluation.
	 * @param action the consumer to run
	 */
	void registerPerSourceSet(Consumer<SourceSet> action);
	Configuration getConfigurationPerSourceSet(String conf, SourceSet sourceSet);
}
