/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.connector.integration.test.Epic;

import org.json.JSONObject;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.connector.integration.test.base.ConnectorIntegrationTestBase;
import org.wso2.connector.integration.test.base.RestResponse;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
/**
 * Integration test for Epic Connector
 */
public class EpicConnectorIntegrationTest extends ConnectorIntegrationTestBase {

    private Map<String, String> eiRequestHeadersMap = new HashMap<String, String>();
    private Map<String, String> apiRequestHeadersMap = new HashMap<String, String>();

    @BeforeClass(alwaysRun = true)
    public void setEnvironment() throws Exception {
        String connectorName = System.getProperty("connector_name") + "-connector-" +
                System.getProperty("connector_version") + ".zip";
        init(connectorName);
        eiRequestHeadersMap.put("Accept-Charset", "UTF-8");
        eiRequestHeadersMap.put("Accept", "application/json+fhir");
        eiRequestHeadersMap.put("Content-Type", "application/json+fhir");
        apiRequestHeadersMap.putAll(eiRequestHeadersMap);
    }

    /**
     * Positive test case for getConformance method with mandatory parameters.
     */
    @Test(enabled = true, description = "epic {getConformance} integration test with mandatory parameters.")
    public void getConformanceWithMandatoryParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:getConformance");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "getConformanceMandatory.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/metadata";
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for readSpecificResourceById method with Mandatory parameters.
     */
    @Test(enabled = true, description = "epic {readSpecificResourceById} integration test with Mandatory parameters.")
    public void readSpecificResourceByIdWithMandatoryParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:readById");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "readSpecificResourceById.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/"
                + connectorProperties.getProperty("type") + "/" + connectorProperties.getProperty("id");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchPatient method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchPatient} integration test with Optional parameters.")
    public void searchPatientWithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchPatient");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchPatient.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/"
                + connectorProperties.getProperty("type") + "?given=" + connectorProperties.getProperty("patientGivenName") +
                "&birthdate=eq" + connectorProperties.getProperty("patientBirthdate");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchCondition method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchCondition} integration test with Optional parameters.")
    public void searchConditionWithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchCondition");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchCondition.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("conditionType") + "?patient=" + connectorProperties.getProperty("patient") +
                "&category=" + connectorProperties.getProperty("conditionCategory");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchMedicationStatement method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchMedicationStatement} integration test with optional parameters.")
    public void searchMedicationStatementwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchMedicationStatement");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchMedicationStatement.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("medicationStatementType") +
                "?patient=" + connectorProperties.getProperty("patient") + "&status=" +
                connectorProperties.getProperty("status");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchGoal method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchGoal} integration test with optional parameters.")
    public void searchGoalwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchGoal");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchGoal.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("goalType") +
                "?patient=" + connectorProperties.getProperty("patient") + "&_lastUpdated=gt" +
                connectorProperties.getProperty("startDate") + "&_lastUpdated=lt" + connectorProperties.getProperty("endDate");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchAllergyIntolerance method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchAllergyIntolerance} integration test with optional parameters.")
    public void searchAllergyIntolerancelwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchAllergyIntolerance");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchAllergyIntolerance.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" + connectorProperties.getProperty("allergyType") +
                "?patient=" + connectorProperties.getProperty("patient") + "&onset=gt" + connectorProperties.getProperty("onset");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchCarePlan method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchCarePlan} integration test with optional parameters.")
    public void searchCarePlanwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchCarePlan");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchCarePlan.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("carePlanType") + "?patient=" + connectorProperties.getProperty("patientId");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchDevice method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchDevice} integration test with optional parameters.")
    public void searchDevicewithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchDevice");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchDevice.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" + connectorProperties.getProperty("deviceType") +
                "?patient=" + connectorProperties.getProperty("patientId");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchDiagnosticReport method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchDiagnosticReport} integration test with optional parameters.")
    public void searchDiagnosticReportwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchDiagnosticReport");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchDiagnosticReport.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("diagnosticReportType") +
                "?patient=" + connectorProperties.getProperty("patientId") + "&date=gt" +
                connectorProperties.getProperty("reportStartDate")
                + "&date=lt" + connectorProperties.getProperty("reportEndDate");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchDocumentReference method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchDocumentReference} integration test with optional parameters.")
    public void searchDocumentReferencewithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchDocumentReference");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchDocumentReference.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("documentReferenceType") +
                "?_id=" + connectorProperties.getProperty("documentId");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchFamilyMemberHistory method with mandatory parameters.
     */
    @Test(enabled = true, description = "epic {searchFamilyMemberHistory} integration test with mandatory parameters.")
    public void searchFamilyMemberHistorywithMandatoryParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchFamilyMemberHistory");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchFamilyMemberHistory.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" +
                connectorProperties.getProperty("familyHistoryType") + "?patient=" + connectorProperties.getProperty("patientId");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchImmunization method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {earchImmunization} integration test with optional parameters.")
    public void searchImmunizationwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchImmunization");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchImmunization.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" + connectorProperties.getProperty("immunizationType") +
                "?patient=" + connectorProperties.getProperty("patientId") + "&date=gt" +
                connectorProperties.getProperty("immunizationStartDate");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchMedicationOrder method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchMedicationOrder} integration test with optional parameters.")
    public void searchMedicationOrderwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchMedicationOrder");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchMedicationOrder.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" + connectorProperties.getProperty("medicationOrderType") +
                "?patient=" + connectorProperties.getProperty("patientId") + "&status=" + connectorProperties.getProperty("status");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchObservation method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchObservation} integration test with optional parameters.")
    public void searchObservationwithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchObservation");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchObservation.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" + connectorProperties.getProperty("observationType") +
                "?patient=" + connectorProperties.getProperty("patientId") + "&code=" + connectorProperties.getProperty("code");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }

    /**
     * Positive test case for searchProcedure method with Optional parameters.
     */
    @Test(enabled = true, description = "epic {searchProcedure} integration test with optional parameters.")
    public void searchProcedurewithOptionalParameters() throws IOException, JSONException {
        eiRequestHeadersMap.put("Action", "urn:searchProcedure");
        RestResponse<JSONObject> eiRestResponse = sendJsonRestRequest(proxyUrl, "POST", eiRequestHeadersMap, "searchProcedure.json");
        final String apiEndPoint = connectorProperties.getProperty("base") + "/" + connectorProperties.getProperty("procedureType") +
                "?patient=" + connectorProperties.getProperty("patientId");
        RestResponse<JSONObject> apiRestResponse = sendJsonRestRequest(apiEndPoint, "GET", apiRequestHeadersMap);
        Assert.assertEquals(eiRestResponse.getHttpStatusCode(), 200,"Invalid parameter value");
        Assert.assertEquals(apiRestResponse.getHttpStatusCode(), 200, "Invalid parameter value");
    }
}
