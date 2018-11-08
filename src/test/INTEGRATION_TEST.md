## Integration tests for WSO2 EI epic connector through Epic API

### Pre-requisites:
   - Maven 3.x
   - Java 1.8

### Tested Platforms:
   -  Ubuntu 16.04
   -  WSO2 EI 6.4.0

### Steps to follow in setting integration test.

1. Download EI 6.4.0  by navigating to the following [URL](http://wso2.com/products/enterprise-service-bus/#).
2. Copy the EI 6.4.0 zip to the location `Connector_Home/repository/`
3. Enable the following message formatter and message builder in the WSO2 EI axis2.xml
	
	```xml
    <messageFormatter contentType="application/json+fhir" class="org.apache.synapse.commons.json.JsonStreamFormatter"/>
	```
	```xml
	<messageBuilder contentType="application/json+fhir" class="org.apache.synapse.commons.json.JsonStreamBuilder"/>
    ```
	
4. Extract the certificate from browser by navigating to the official epic sandbox URL<https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB> and Add the certificate obtained to `EI_HOME/repository/`.
	    
5. Update the following properties in `esb-connector-epic.properties` file at `Connector_Home/repository/`
            base
6. Update connector properties file `epic.properties` located in `EPIC_HOME/src/test/resources/artifacts/ESB/connector/config/`,
   with relevant information.
   
    |Properties|Description|
    |-----------|----------|
    |base | The base URL.|
    |type | Type of the resource.|
    |id | Id of the resource.|
    |patientId | Patient Id.|
    |patientBirthdate | Patient birthdate.|
    |patientGivenName | Patient's first name or given name.|
    |patient | Patient Id.|
    |conditionCategory | category of the condition.|
    |status | The status (active)|
    |startDate | start date from a date-range.|
    |endDate | end date froma date-range.|
    |onset | Date in which the condition was first affected.|
    |reportStartDate | start date of the report.|
    |reportEndDate | end date of the report.|
    |documentId | Document Id.|
    |code | code of the observation type.|

	
5.Navigate to `EPIC_HOME` and run the following command.

```console
$ mvn clean install -Dskip-tests=false
```