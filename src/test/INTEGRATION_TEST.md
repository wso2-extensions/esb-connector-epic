### Product: Integration tests for WSO2 ESB epic connector through REST API

**Pre-requisites:**
- Maven 3.x
- Java 1.8

**Tested Platform:**
- ubuntu 16.04
- WSO2 EI 6.3.0

Steps to follow in setting integration test.

1. Download WSO2 EI 6.3.0 from official website and copy the EI 6.3.0 zip to "{EPIC_HOME}/repository".
	
	2. Enable the following message formatter and message builder in the WSO2 EI axis2.xml
	```xml
    <messageFormatter contentType="application/json+fhir" class="org.apache.synapse.commons.json.JsonStreamFormatter"/>
	```
	```xml
	<messageBuilder contentType="application/json+fhir" class="org.apache.synapse.commons.json.JsonStreamBuilder"/>
    ```
	
3. Extract the certificate from browser by navigating to the official epic sandbox URL<https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB> and Add the certificate obtained to "<EI_HOME>/repository/.
	
4. Update connector properties file "Epic.properties" located in "EPIC_HOME/src/test/resources/artifacts/ESB/connector/config/",
	with relevant information.
	
    1. base: The base URL.
    2. type: Type of the resource.
    3. id: Id of the resource.
    4. patientId: Patient Id.
    5. patientBirthdate: Patient birthdate.
    6. patientGivenName: Patient's first name or given name.
    7. conditionType: Condition resource Type (Condition)
    8. patient: Patient Id.
    9. conditionCategory: category of the condition.
    10. medicationStatementType: MedicationStatement resource Type (MedicationStatement)
    11. status: The status (active)
    12. goalType: Goal resource Type (Goal)
    13. startDate: start date from a date-range.
    14. endDate: end date froma date-range.
    15. allergyType: Allergy intolerance type.
    16. onset: Date in which the condition was first affected.
    17. carePlanType: CarePlan resource Type (CarePlan).
    18. deviceType: Device resource Type (Device).
    19. reportStartDate: start date of the report.
    20. reportEndDate: end date of the report.
    21. documentReferenceType: DocumentReference resource type (DocumentReference).
    22. documentId: Document Id.
    23. familyHistoryType: FamilyMemberHistory resource Type (FamilyMemberHistory)
    24. immunizationType: Immunization resource Type (Immunization).
    25. immunizationStartDate: start date of the Immunization.
    26. medicationOrderType: MedicationOrder resource type (MedicationOrder).
    27. observationType: Observation resource Type (Observation).
    28. code: code of the observation type
    29. procedureType: Procedure resource Type. (Procedure).
    30. diagnosticReportType: DiagnosticReport resource Type (DiagnosticReport).
	
5.Navigate to "{EPIC_HOME}" and run the following command.

```console
$ mvn clean install -Dskip-tests=false
```