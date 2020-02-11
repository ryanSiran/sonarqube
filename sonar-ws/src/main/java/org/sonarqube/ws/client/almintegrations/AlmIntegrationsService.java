/*
 * SonarQube
 * Copyright (C) 2009-2020 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarqube.ws.client.almintegrations;

import javax.annotation.Generated;
import org.sonarqube.ws.AlmIntegrations;
import org.sonarqube.ws.MediaTypes;
import org.sonarqube.ws.Projects;
import org.sonarqube.ws.client.BaseService;
import org.sonarqube.ws.client.GetRequest;
import org.sonarqube.ws.client.PostRequest;
import org.sonarqube.ws.client.WsConnector;

/**
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/alm_integrations">Further information about this web service online</a>
 */
@Generated("sonar-ws-generator")
public class AlmIntegrationsService extends BaseService {

  public AlmIntegrationsService(WsConnector wsConnector) {
    super(wsConnector, "api/alm_integrations");
  }

  /**
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/alm_integrations/check_pat">Further information about this action online (including a response example)</a>
   * @since 8.2
   */
  public void checkPat(CheckPatRequest request) {
    call(
      new GetRequest(path("check_pat"))
        .setParam("almSetting", request.getAlmSetting())
        .setMediaType(MediaTypes.JSON)
      ).content();
  }

  /**
   *
   * This is part of the internal API.
   * This is a POST request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/alm_integrations/import_bitbucketserver_project">Further information about this action online (including a response example)</a>
   * @since 8.2
   */
  public Projects.CreateWsResponse importBitbucketserverProject(ImportBitbucketserverProjectRequest request) {
    return call(
      new PostRequest(path("import_bitbucketserver_project"))
        .setParam("almSetting", request.getAlmSetting())
        .setParam("projectKey", request.getProjectKey())
        .setParam("repositorySlug", request.getRepositorySlug())
        .setMediaType(MediaTypes.JSON),
      Projects.CreateWsResponse.parser());
  }

  /**
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/alm_integrations/list_bibucketserver_projects">Further information about this action online (including a response example)</a>
   * @since 8.2
   */
  public AlmIntegrations.ListBitbucketserverProjectsWsResponse listBibucketserverProjects(ListBibucketserverProjectsRequest request) {
    return call(
      new GetRequest(path("list_bibucketserver_projects"))
        .setParam("almSetting", request.getAlmSetting())
        .setMediaType(MediaTypes.JSON),
      AlmIntegrations.ListBitbucketserverProjectsWsResponse.parser());
  }

  /**
   *
   * This is part of the internal API.
   * This is a GET request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/alm_integrations/search_bibucketserver_repos">Further information about this action online (including a response example)</a>
   * @since 8.2
   */
  public AlmIntegrations.SearchBitbucketserverReposWsResponse searchBibucketserverRepos(SearchBibucketserverReposRequest request) {
    return call(
      new GetRequest(path("search_bibucketserver_repos"))
        .setParam("almSetting", request.getAlmSetting())
        .setParam("projectName", request.getProjectName())
        .setParam("repositoryName", request.getRepositoryName())
        .setMediaType(MediaTypes.JSON),
      AlmIntegrations.SearchBitbucketserverReposWsResponse.parser());
  }

  /**
   *
   * This is part of the internal API.
   * This is a POST request.
   * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/alm_integrations/set_pat">Further information about this action online (including a response example)</a>
   * @since 8.2
   */
  public void setPat(SetPatRequest request) {
    call(
      new PostRequest(path("set_pat"))
        .setParam("almSetting", request.getAlmSetting())
        .setParam("pat", request.getPat())
        .setMediaType(MediaTypes.JSON)
      ).content();
  }
}
