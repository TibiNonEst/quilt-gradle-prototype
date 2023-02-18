/*
 * Copyright 2022-2023 QuiltMC
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

package org.quiltmc.gradle.task;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.TaskAction;
import org.quiltmc.gradle.MappingsProvider;

import java.io.File;

public abstract class RemapSourcesJarTask extends DefaultTask {
	@InputFile
	public abstract File getJar();
	public abstract void setJar(File jar);

	@Input
	public abstract MappingsProvider getMappingsProvider();
	public abstract void setMappingsProvider(MappingsProvider mappingsProvider);

	@TaskAction
	public void execute() {
		// TODO: Source jar remapping
	}
}
