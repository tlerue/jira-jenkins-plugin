/**
 * Copyright 2012 codecentric GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.codecentric.jira.jenkins.plugin.model;

import de.codecentric.jira.jenkins.plugin.model.JenkinsBuild;

/**
 * This class represents a Jenkins Job. It is used in the portlet classes to
 * store informations in a appropriate format.
 * 
 */
public class JenkinsJob {

	private String name;
	private String url;
	private String buildTrigger;
	private String color;
	private String description;
	private JenkinsBuild lastSuccBuild;
	private JenkinsBuild lastFailBuild;
	private String health;
	private int duration;

	/**
	 * Get the name of the job.
	 * 
	 * @return name Name of the job.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the job.
	 * 
	 * @param name
	 *            Name of the job.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the URL of the job.
	 * 
	 * @return url URL of the job.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the URL of the job.
	 * 
	 * @param url
	 *            URL of the job.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Get the status color of the job.
	 * 
	 * @return color The status color of the job.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Set the color of the job.
	 * 
	 * @param color
	 *            Status color of the job.
	 */
	public void setColor(String color) {
		if ("aborted".equals(color)||"disabled".equals(color)) {
			this.color = "grey";
		}else {
			this.color = color;
		}
	}

	/**
	 * Get the description of the job.
	 * 
	 * @return description Description of the job.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description of the job.
	 * 
	 * @param description
	 *            Description of the job.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public void setLastSuccBuild(JenkinsBuild lastSuccBuild2) {
		this.lastSuccBuild = lastSuccBuild2;
	}

	public JenkinsBuild getLastSuccBuild() {
		return lastSuccBuild;
	}

	public void setLastFailBuild(JenkinsBuild lastFailBuild2) {
		this.lastFailBuild = lastFailBuild2;
	}

	public JenkinsBuild getLastFailBuild() {
		return lastFailBuild;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getHealth() {
		return health;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setBuildTrigger(String buildTrigger) {
		this.buildTrigger = buildTrigger;
	}

	public String getBuildTrigger() {
		return buildTrigger;
	}

}
