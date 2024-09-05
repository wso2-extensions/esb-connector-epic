# Supported operations

Below is the list of supported operations from the fhir base module. Click on each operation name to see its details.

* [init](#init-operation)
* [create](#create-operation)
* [getCapabilityStatement](#getCapabilityStatement-operation)
* [readById](#readById-operation)
* [searchAccount](#searchAccount-operation)
* [searchAdverseEvent](#searchAdverseEvent-operation)
* [searchAllergyIntolerance](#searchAllergyIntolerance-operation)
* [searchAppointment](#searchAppointment-operation)
* [searchBinary](#searchBinary-operation)
* [searchBodyStructure](#searchBodyStructure-operation)
* [searchCarePlan](#searchCarePlan-operation)
* [searchCareTeam](#searchCareTeam-operation)
* [searchCommunication](#searchCommunication-operation)
* [searchCondition](#searchCondition-operation)
* [searchConsent](#searchConsent-operation)
* [searchContract](#searchContract-operation)
* [searchCoverage](#searchCoverage-operation)
* [searchDevice](#searchDevice-operation)
* [searchDeviceRequest](#searchDeviceRequest-operation)
* [searchDeviceUseStatement](#searchDeviceUseStatement-operation)
* [searchDiagnosticReport](#searchDiagnosticReport-operation)
* [searchDocumentReference](#searchDocumentReference-operation)
* [searchEncounter](#searchEncounter-operation)
* [searchEndpoint](#searchEndpoint-operation)
* [searchEpisodeOfCare](#searchEpisodeOfCare-operation)
* [searchFamilyMemberHistory](#searchFamilyMemberHistory-operation)
* [searchFlag](#searchFlag-operation)
* [searchGoal](#searchGoal-operation)
* [searchGroup](#searchGroup-operation)
* [searchHealthcareService](#searchHealthcareService-operation)
* [searchImagingStudy](#searchImagingStudy-operation)
* [searchImmunization](#searchImmunization-operation)
* [searchImmunizationEvaluation](#searchImmunizationEvaluation-operation)
* [searchImmunizationRecommendation](#searchImmunizationRecommendation-operation)
* [searchImplementationGuide](#searchImplementationGuide-operation)
* [searchInsurancePlan](#searchInsurancePlan-operation)
* [searchInvoice](#searchInvoice-operation)
* [searchLibrary](#searchLibrary-operation)
* [searchLinkage](#searchLinkage-operation)
* [searchList](#searchList-operation)
* [searchLocation](#searchLocation-operation)
* [searchMeasure](#searchMeasure-operation)
* [searchMeasureReport](#searchMeasureReport-operation)
* [searchMedication](#searchMedication-operation)
* [searchMedicationAdministration](#searchMedicationAdministration-operation)
* [searchMedicationDispense](#searchMedicationDispense-operation)
* [searchMedicationRequest](#searchMedicationRequest-operation)
* [searchNutritionOrder](#searchNutritionOrder-operation)
* [searchObservation](#searchObservation-operation)
* [searchOrganization](#searchOrganization-operation)
* [searchPatient](#searchPatient-operation)
* [searchPractitioner](#searchPractitioner-operation)
* [searchPractitionerRole](#searchPractitionerRole-operation)
* [searchProcedure](#searchProcedure-operation)
* [searchQuestionnaire](#searchQuestionnaire-operation)
* [searchQuestionnaireResponse](#searchQuestionnaireResponse-operation)
* [searchRelatedPerson](#searchRelatedPerson-operation)
* [searchRequestGroup](#searchRequestGroup-operation)
* [searchResearchStudy](#searchResearchStudy-operation)
* [searchResearchSubject](#searchResearchSubject-operation)
* [searchServiceRequest](#searchServiceRequest-operation)
* [serviceSpecimen](#searchSpecimen-operation)
* [searchSubstance](#searchSubstance-operation)
* [searchTask](#searchTask-operation)
* [update](#update-operation)


# init Operation

The `init` operation is used to configure the Epic connector. You need the client id of the Epic app and the private key here and set the Base URL and Token EndPoint.

## Properties

| Property Name      | Property Description                                                                 |
|--------------------|---------------------------------------------------------------------------------------|
| `base`             | The service Root URL.                                                                 |
| `accessToken`      | Represents the authorization of a specific application to access specific parts of a user’s data. |
| `clientId`         | Client ID of the registered application.                                              |
| `tokenEndpoint`    | An HTTP endpoint that can be used to obtain an access token.                          |
| `privateKey`       | The private key of the registered application.                                        |
| `keyStore`         | The name of the keystore in which the private key is stored.                          |
| `keyStorePass`     | The passphrase of the keystore.                                                       |
| `privateKeyAlias`  | The alias of the private key.                                                         |
| `enableUrlRewrite` | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`          | Optional base URL to be replaced in the response.                                     |
| `serverUrl`        | Public server URL for URL rewrite.                                                    |


# create operation

The `create` operation is used to create a new resource in the Epic system.

## Properties

| Property Name      | Property Description                                                                 |
|--------------------|---------------------------------------------------------------------------------------|
| `type`             | The type of the resource to be created.                                               |
| `enableUrlRewrite` | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`          | Optional base URL to be replaced in the response.                                     |
| `serverUrl`        | Public server URL for URL rewrite.                                                    |

# getCapabilityStatement operation

The `getCapabilityStatement` operation is used to retrieve the CapabilityStatement resource from the Epic system.

# readById operation

The `readById` operation is used to retrieve a resource by its ID from the Epic system.

## Properties

| Property Name      | Property Description                                                                 |
|--------------------|---------------------------------------------------------------------------------------|
| `type`             | The type of the resource.                                                             |
| `id`               | The logical Id of the resource.                                                       |
| `enableUrlRewrite` | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`          | Optional base URL to be replaced in the response.                                     |
| `serverUrl`        | Public server URL for URL rewrite.                                                    |

# searchAccount operation

The `searchAccount` operation is used to search for account resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |

# searchAdverseEvent operation

The `searchAdverseEvent` operation is used to search for adverse event resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `seriousness`                | Refine a search for AdverseEvent resources by seriousness of the event. Serious and Non-serious are the only supported values. |
| `study`                      | Search for AdverseEvent resources for a specified study ID.                           |
| `subject`                    | Search for AdverseEvent resources for a specified patient ID.                         |
| `actuality`                  | The actuality of the adverse event (e.g., actual, potential).                         |
| `category`                   | The category of the adverse event (e.g., product problem, medication error).          |
| `dateSearchBy`               | Date-related search parameter.                                                        |
| `dateUpperBound`             | Upper bound for date search.                                                          |
| `dateLowerBound`             | Lower bound for date search.                                                          |
| `date`                       | The date when the adverse event occurred.                                             |
| `event`                      | The specific event that occurred.                                                     |
| `location`                   | Location where the adverse event occurred.                                            |
| `recorder`                   | Person or device recording the adverse event.                                         |
| `resultingcondition`         | Condition that resulted from the adverse event.                                       |
| `severity`                   | The severity of the adverse event (e.g., mild, moderate, severe).                     |
| `substance`                  | The substance involved in the adverse event.                                          |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchAllergyIntolerance operation

The `searchAllergyIntolerance` operation is used to search for allergy intolerance resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `clinicalStatus`             | The clinical status of the allergy or intolerance (e.g., active, inactive).           |
| `patient`                    | The patient for whom the allergy or intolerance is recorded.                          |
| `asserter`                   | The source of the information about the allergy or intolerance.                       |
| `category`                   | Category of the allergy or intolerance (e.g., food, medication).                      |
| `code`                       | The code for the allergy or intolerance.                                              |
| `criticality`                | The criticality of the allergy or intolerance (e.g., high, low).                      |
| `dateSearchBy`               | Date-related search parameter.                                                        |
| `dateUpperBound`             | Upper bound for date search.                                                          |
| `dateLowerBound`             | Lower bound for date search.                                                          |
| `date`                       | Date the allergy or intolerance was recorded or updated.                              |
| `identifier`                 | Unique identifier for the allergy or intolerance.                                     |
| `lastDateSearchBy`           | Last date-related search parameter.                                                   |
| `lastDateUpperBound`         | Upper bound for last date search.                                                     |
| `lastDateLowerBound`         | Lower bound for last date search.                                                     |
| `lastDate`                   | The last occurrence date of the allergy or intolerance.                               |
| `manifestation`              | Clinical symptoms or manifestations of the allergy or intolerance.                    |
| `onsetSearchBy`              | Onset date-related search parameter.                                                  |
| `onsetUpperBound`            | Upper bound for onset date search.                                                    |
| `onsetLowerBound`            | Lower bound for onset date search.                                                    |
| `onset`                      | The date or period when the allergy or intolerance first manifested.                  |
| `recorder`                   | Person or device recording the allergy or intolerance.                                |
| `route`                      | The route of exposure to the allergen (e.g., inhalation, ingestion).                  |
| `severity`                   | The severity of the allergy or intolerance (e.g., mild, moderate, severe).            |
| `type`                       | The type of the allergy or intolerance (e.g., allergy, intolerance).                   |
| `verificationStatus`         | The verification status of the allergy or intolerance (e.g., confirmed, unconfirmed).  |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                           |
| `countUpperBound`            | Upper bound for the number of results per page.                                        |
| `countLowerBound`            | Lower bound for the number of results per page.                                        |
| `count`                      | Number of results per page.                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |

# searchAppointment operation

The `searchAppointment` operation is used to search for appointment resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `dateSearchBy`               | Date-related search parameter.                                                        |
| `dateUpperBound`             | Upper bound for date search.                                                          |
| `dateLowerBound`             | Lower bound for date search.                                                          |
| `date`                       | Date of the appointment.                                                               |
| `identifier`                 | Unique identifier for the appointment.                                                |
| `patient`                    | Search for Appointment resources for a specified patient ID.                          |
| `serviceCategory`            | Search on the type of appointment. Enter `surgery` for scheduled surgery appointments, and `appointment` for all other types of appointments. |
| `status`                     | The status of the appointment (e.g., booked, cancelled).                              |
| `actor`                      | The practitioner or patient involved in the appointment.                              |
| `appointmentType`            | The type of appointment (e.g., follow-up, consultation).                              |
| `basedOn`                    | The referral or request that the appointment is based on.                             |
| `location`                   | The location where the appointment takes place.                                       |
| `partStatus`                 | The status of the participant in the appointment (e.g., accepted, declined).          |
| `practitioner`               | The practitioner who is responsible for the appointment.                              |
| `reasonCode`                 | The reason for the appointment, coded using standard codes.                           |
| `reasonReference`            | A reference to the condition or other reason for the appointment.                     |
| `serviceType`                | The type of service being offered in the appointment (e.g., general practice, surgery).|
| `slot`                       | The slot in which the appointment is scheduled.                                        |
| `specialty`                  | The specialty of the practitioner involved in the appointment.                        |
| `supportingInfo`             | Additional information supporting the appointment.                                    |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchBinary operation

The `searchBinary` operation is used to search for binary resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchBodyStructure operation

The `searchBodyStructure` operation is used to search for body structure resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `location`                   | Refine a search for BodyStructure resources by identifier. Enter using the structure `[system]|[search string]`. |
| `morphology`                 | Refine a search for BodyStructure resources by morphology (e.g., anatomical structure).|
| `patient`                    | Search for BodyStructure resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `subject`                    | Search for BodyStructure resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |

# searchCarePlan operation

The `searchCarePlan` operation is used to search for care plan resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `activityDateSearchBy`       | Search based on the date of the activity.                                             |
| `activityDateUpperBound`     | Upper bound for the activity date search.                                             |
| `activityDateLowerBound`     | Lower bound for the activity date search.                                             |
| `activityDate`               | The specific date for the activity.                                                   |
| `category`                   | Search for CarePlans of the given type. This is a required search parameter.          |
| `encounter`                  | Search for CarePlan resources associated with a specified encounter ID.                |
| `partOf`                     | Search for CarePlans that are part of another CarePlan or plan.                        |
| `patient`                    | Search for CarePlan resources using a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `status`                     | Search for CarePlan resources based on their status (e.g., active, completed).         |
| `subject`                    | Search for CarePlan resources using a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `activityCode`               | Search for CarePlans based on the code of the activity.                                |
| `activityReference`          | Search for CarePlans based on a reference to an activity.                              |
| `basedOn`                    | Search for CarePlans based on the plan that they are based on.                         |
| `careTeam`                   | Search for CarePlans that involve a specified care team.                               |
| `condition`                  | Search for CarePlans based on a related condition.                                     |
| `dateSearchBy`               | Search based on the date field criteria.                                               |
| `dateUpperBound`             | Upper bound for the date search.                                                       |
| `dateLowerBound`             | Lower bound for the date search.                                                       |
| `date`                       | The specific date for the search.                                                      |
| `goal`                       | Search for CarePlans related to a specified goal.                                      |
| `identifier`                 | Search for CarePlans based on a specified identifier.                                  |
| `instantiatesCanonical`      | Search for CarePlans that instantiate a specified canonical resource.                  |
| `intent`                     | Search for CarePlans based on their intent (e.g., proposal, plan).                     |
| `performer`                  | Search for CarePlans involving a specific performer.                                   |
| `replaces`                   | Search for CarePlans that replace a specified plan.                                    |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchCareTeam operation

The `searchCareTeam` operation is used to search for care team resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `patient`                    | Search for CareTeam resources using a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `status`                     | Refine a search based on the CareTeam's status. Currently only `active` is supported.  |
| `subject`                    | Search for CareTeam resources using a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `category`                   | Search for CareTeam resources by category or type (e.g., multidisciplinary, specialty). |
| `dateSearchBy`               | Search based on the date field criteria.                                               |
| `dateUpperBound`             | Upper bound for the date search.                                                       |
| `dateLowerBound`             | Lower bound for the date search.                                                       |
| `date`                       | The specific date for the search.                                                      |
| `encounter`                  | Search for CareTeam resources associated with a specific encounter ID.                |
| `identifier`                 | Search for CareTeam resources based on a specified identifier.                         |
| `participant`                | Search for CareTeam resources based on a specified participant ID.                     |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchCommunication operation

The `searchCommunication` operation is used to search for communication resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `basedOn`                    | Search for Communication resources based on the related `basedOn` reference.            |
| `category`                   | Refine a search to include only Communication resources with the given categories.    |
| `encounter`                  | Refine a search to include Communication resources from only the encounters provided. |
| `partOf`                     | Search for Communication resources related to a specific part of another resource.     |
| `patient`                    | Search for Communication resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `subject`                    | Search for Communication resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `identifier`                 | Search for Communication resources based on a specified identifier.                   |
| `instantiatesCanonical`      | Search for Communication resources that are instantiated based on the given canonical reference. |
| `medium`                     | Search for Communication resources based on the communication medium (e.g., email, phone). |
| `receivedSearchBy`           | Search based on the criteria for the received date.                                    |
| `receivedUpperBound`         | Upper bound for the received date search.                                              |
| `receivedLowerBound`         | Lower bound for the received date search.                                              |
| `received`                   | Specific received date for the search.                                                 |
| `recipient`                  | Search for Communication resources by recipient ID.                                    |
| `sender`                     | Search for Communication resources by sender ID.                                       |
| `sentSearchBy`               | Search based on the criteria for the sent date.                                        |
| `sentUpperBound`             | Upper bound for the sent date search.                                                  |
| `sentLowerBound`             | Lower bound for the sent date search.                                                  |
| `sent`                       | Specific sent date for the search.                                                     |
| `status`                     | Search for Communication resources by status (e.g., completed, in-progress).            |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchCondition operation

The `searchCondition` operation is used to search for condition resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `abatementDateSearchBy`      | Search based on the criteria for the abatement date.                                    |
| `abatementDateUpperBound`    | Search for Conditions with a specified upper bound for the abatement date.             |
| `abatementDateLowerBound`    | Search for Conditions with a specified lower bound for the abatement date.             |
| `abatementDate`              | Search for Conditions with a specific abatement date.                                  |
| `category`                   | Search for Condition resources by category.                                           |
| `clinicalStatus`             | Refine a search by clinical status. Only `inactive`, `resolved`, and `active` are supported for health concerns and problem list items. Only `inactive` and `active` are supported for infections. |
| `code`                       | Search for Conditions with a specific code.                                            |
| `encounter`                  | Search for Condition resources for specific encounters.                               |
| `onsetDateSearchBy`          | Search based on the criteria for the onset date.                                       |
| `onsetDateUpperBound`        | Search for Conditions with a specified upper bound for the onset date.                 |
| `onsetDateLowerBound`        | Search for Conditions with a specified lower bound for the onset date.                 |
| `onsetDate`                  | Search for Conditions with a specific onset date.                                      |
| `patient`                    | Search for Condition resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `recordedDateSearchBy`       | Search based on the criteria for the recorded date.                                    |
| `recordedDateUpperBound`     | Search for Conditions with a specified upper bound for the recorded date.              |
| `recordedDateLowerBound`     | Search for Conditions with a specified lower bound for the recorded date.              |
| `recordedDate`               | Search for Conditions with a specific recorded date.                                   |
| `subject`                    | Search for Condition resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `abatementString`            | Search for Conditions with a specific abatement string.                                |
| `asserter`                   | Search for Conditions based on the asserter (e.g., practitioner, organization).        |
| `bodySite`                   | Search for Conditions based on the body site affected.                                 |
| `evidence`                   | Search for Conditions based on the evidence provided.                                  |
| `evidenceDetail`             | Search for Conditions based on detailed evidence.                                      |
| `identifier`                 | Search for Conditions with a specific identifier.                                      |
| `onsetInfo`                  | Search for Conditions based on onset information.                                      |
| `severity`                   | Search for Conditions based on severity.                                               |
| `stage`                      | Search for Conditions based on the stage of the condition.                             |
| `verificationStatus`         | Search for Conditions based on the verification status.                                |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |

# searchConsent operation

The `searchConsent` operation is used to search for consent resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `category`                   | Search for Consent resources by category.                                             |
| `patient`                    | Search for Consent resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `status`                     | Search for Consent resources by status.                                               |
| `subject`                    | Search for Consent resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `action`                     | Search for Consent resources based on action.                                          |
| `actor`                      | Search for Consent resources based on actor.                                           |
| `consentor`                  | Search for Consent resources based on the consentor.                                   |
| `data`                       | Search for Consent resources based on data.                                            |
| `dateSearchBy`              | Search based on the criteria for the date.                                             |
| `dateUpperBound`            | Search for Consent resources with a specified upper bound for the date.                |
| `dateLowerBound`            | Search for Consent resources with a specified lower bound for the date.                |
| `date`                       | Search for Consent resources with a specific date.                                     |
| `identifier`                 | Search for Consent resources with a specific identifier.                               |
| `organization`              | Search for Consent resources associated with a specific organization.                  |
| `periodSearchBy`            | Search based on the criteria for the period.                                           |
| `periodUpperBound`          | Search for Consent resources with a specified upper bound for the period.              |
| `periodLowerBound`          | Search for Consent resources with a specified lower bound for the period.              |
| `period`                    | Search for Consent resources with a specific period.                                   |
| `purpose`                   | Search for Consent resources based on purpose.                                         |
| `scope`                     | Search for Consent resources based on scope.                                           |
| `securityLabel`             | Search for Consent resources based on security labels.                                 |
| `sourceReference`           | Search for Consent resources based on source reference.                                |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |

# searchContract operation

The `searchContract` operation is used to search for contract resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                 |
|------------------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                     |
| `serverUrl`                  | Public server URL for URL rewrite.                                                    |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                          |
| `countUpperBound`            | Upper bound for the number of results per page.                                       |
| `countLowerBound`            | Lower bound for the number of results per page.                                       |
| `count`                      | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                         |


# searchCoverage operation

The `searchCoverage` operation is used to search for coverage resources in the Epic system.

## Properties

| Property Name        | Property Description                                                                 |
|----------------------|---------------------------------------------------------------------------------------|
| `enableUrlRewrite`   | Whether to enable/disable URL rewrite in the response payload.                        |
| `baseUrl`            | Optional base URL to be replaced in the response.                                     |
| `serverUrl`          | Public server URL for URL rewrite.                                                    |
| `beneficiary`        | Search for Coverage resource for a specific patient ID. You can use "patient" or "beneficiary" equivalently, but they cannot be used at the same time for different references. |
| `patient`            | Search for Coverage resource for a specific patient ID. You can use "patient" or "beneficiary" equivalently, but they cannot be used at the same time for different references. |
| `classType`          | Coverage class type.                                                                  |
| `classValue`         | Coverage class value.                                                                 |
| `dependent`          | Coverage dependent.                                                                   |
| `identifier`         | Coverage identifier.                                                                  |
| `payor`              | Coverage payor.                                                                       |
| `policyHolder`       | Coverage policy holder.                                                               |
| `status`             | Coverage status.                                                                      |
| `subscriber`         | Coverage subscriber.                                                                  |
| `type`               | Coverage type.                                                                        |
| `id`                 | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`      | Number of results per page search parameter.                                          |
| `countUpperBound`    | Upper bound for the number of results per page.                                       |
| `countLowerBound`    | Lower bound for the number of results per page.                                       |
| `count`              | Number of results per page.                                                           |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                   |

# searchDevice operation

The `searchDevice` operation is used to search for device resources in the Epic system.

## Properties

| Property Name       | Property Description                                                                                             |
|---------------------|-----------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`  | Whether to enable/disable URL rewrite in the response payload.                                                   |
| `baseUrl`           | Optional base URL to be replaced in the response.                                                                |
| `serverUrl`         | Public server URL for URL rewrite.                                                                             |
| `deviceName`        | A string that will match the `Device.deviceName.name` field. Not case sensitive.                                 |
| `manufacturer`      | Manufacturer of the device.                                                                                     |
| `model`             | Model number of the device.                                                                                      |
| `patient`           | The patient in whom this device is implanted. This is a required parameter.                                      |
| `udiCarrier`        | The UDI barcode string - matches static UDI.                                                                    |
| `udiDi`             | The UDI device identifier (DI).                                                                                   |
| `identifier`        | Device identifier.                                                                                              |
| `location`          | Location of the device.                                                                                        |
| `organization`      | Organization associated with the device.                                                                        |
| `status`            | Status of the device.                                                                                           |
| `type`              | Type of the device.                                                                                            |
| `id`                | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`     | Number of results per page search parameter.                                                                    |
| `countUpperBound`   | Upper bound for the number of results per page.                                                                 |
| `countLowerBound`   | Lower bound for the number of results per page.                                                                 |
| `count`             | Number of results per page.                                                                                      |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                |

# searchDeviceRequest operation

The `searchDeviceRequest` operation is used to search for device request resources in the Epic system.

## Properties

| Property Name           | Property Description                                                                                   |
|-------------------------|-------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`      | Whether to enable/disable URL rewrite in the response payload.                                       |
| `baseUrl`               | Optional base URL to be replaced in the response.                                                    |
| `serverUrl`             | Public server URL for URL rewrite.                                                                   |
| `patient`               | Search for DeviceRequest resource for a specified patient ID.                                        |
| `status`                | Search for a DeviceRequest based on a device request status.                                          |
| `authoredOnSearchBy`    | Search parameter for the authoredOn date field.                                                       |
| `authoredOnUpperBound`  | Upper bound for searching DeviceRequests by the authoredOn date.                                      |
| `authoredOnLowerBound`  | Lower bound for searching DeviceRequests by the authoredOn date.                                      |
| `authoredOn`            | Search for DeviceRequests by the authoredOn date.                                                     |
| `basedOn`               | Search for DeviceRequests based on other resources.                                                   |
| `code`                  | Search for DeviceRequests by code.                                                                     |
| `device`                | Search for DeviceRequests related to a specific device.                                                |
| `encounter`             | Search for DeviceRequests related to a specific encounter.                                             |
| `eventDateSearchBy`     | Search parameter for the eventDate field.                                                              |
| `eventDateUpperBound`   | Upper bound for searching DeviceRequests by the eventDate.                                             |
| `eventDateLowerBound`   | Lower bound for searching DeviceRequests by the eventDate.                                             |
| `eventDate`             | Search for DeviceRequests by the eventDate.                                                            |
| `groupIdentifier`       | Search for DeviceRequests by group identifier.                                                        |
| `identifier`            | Search for DeviceRequests by identifier.                                                               |
| `instantiatesCanonical` | Search for DeviceRequests by canonical instantiation.                                                  |
| `insurance`             | Search for DeviceRequests by insurance coverage.                                                      |
| `intent`                | Search for DeviceRequests by intent.                                                                   |
| `performer`             | Search for DeviceRequests by performer.                                                               |
| `priorRequest`          | Search for DeviceRequests by prior request.                                                            |
| `requester`             | Search for DeviceRequests by requester.                                                               |
| `subject`               | Search for DeviceRequests related to a specific subject.                                               |
| `id`                    | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`         | Number of results per page search parameter.                                                          |
| `countUpperBound`       | Upper bound for the number of results per page.                                                        |
| `countLowerBound`       | Lower bound for the number of results per page.                                                        |
| `count`                 | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                        |

# searchDeviceUseStatement operation

The `searchDeviceUseStatement` operation is used to search for device use statement resources in the Epic system.

## Properties

| Property Name           | Property Description                                                                                   |
|-------------------------|-------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`      | Whether to enable/disable URL rewrite in the response payload.                                       |
| `baseUrl`               | Optional base URL to be replaced in the response.                                                    |
| `serverUrl`             | Public server URL for URL rewrite.                                                                   |
| `patient`               | Search for DeviceUseStatement resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `subject`               | Search for DeviceUseStatement resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `device`                | Search for DeviceUseStatement resources related to a specific device.                                 |
| `identifier`            | Search for DeviceUseStatement resources by identifier.                                                 |
| `id`                    | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`         | Number of results per page search parameter.                                                          |
| `countUpperBound`       | Upper bound for the number of results per page.                                                        |
| `countLowerBound`       | Lower bound for the number of results per page.                                                        |
| `count`                 | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                        |


# searchDiagnosticReport operation

The `searchDiagnosticReport` operation is used to search for diagnostic report resources in the Epic system.

## Properties

| Property Name           | Property Description                                                                                   |
|-------------------------|-------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`      | Whether to enable/disable URL rewrite in the response payload.                                       |
| `baseUrl`               | Optional base URL to be replaced in the response.                                                    |
| `serverUrl`             | Public server URL for URL rewrite.                                                                   |
| `category`              | Refine a search for DiagnosticReport resources by category.                                           |
| `code`                  | Refine a search for DiagnosticReport resources by code.                                               |
| `dateSearchBy`          | Refine a search for DiagnosticReport resources by specifying a date or date range.                   |
| `dateUpperBound`        | Refine a search by specifying the upper bound of a date or date range that a DiagnosticReport was resulted or recorded. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `dateLowerBound`        | Refine a search by specifying the lower bound of a date or date range that a DiagnosticReport was resulted or recorded. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `date`                  | Refine a search by specifying a date or date range that a DiagnosticReport was resulted or recorded. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `identifier`            | Refine search by specifying an identifier, such as the internal order ID or the accession number.      |
| `patient`               | Search for DiagnosticReport resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `subject`               | Search for DiagnosticReport resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `basedOn`               | Refine a search by specifying the request or order this report is based on.                           |
| `conclusion`            | Refine a search by specifying the conclusion of the diagnostic report.                               |
| `encounter`             | Refine a search by specifying the encounter associated with the diagnostic report.                    |
| `issuedSearchBy`        | Refine a search for DiagnosticReport resources by the issued date.                                    |
| `issuedUpperBound`      | Upper bound for the issued date of the diagnostic report.                                              |
| `issuedLowerBound`      | Lower bound for the issued date of the diagnostic report.                                              |
| `issued`                | Search for DiagnosticReport resources by the issued date.                                              |
| `media`                 | Refine a search by specifying the media used in the diagnostic report.                                |
| `performer`             | Refine a search by specifying the performer of the diagnostic report.                                 |
| `result`                | Refine a search by specifying the result of the diagnostic report.                                     |
| `resultsInterpreter`    | Refine a search by specifying the results interpreter.                                                |
| `specimen`              | Refine a search by specifying the specimen associated with the diagnostic report.                     |
| `status`                | Refine a search by specifying the status of the diagnostic report.                                     |
| `id`                    | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`         | Number of results per page search parameter.                                                          |
| `countUpperBound`       | Upper bound for the number of results per page.                                                        |
| `countLowerBound`       | Lower bound for the number of results per page.                                                        |
| `count`                 | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                        |


# searchDocumentReference operation

The `searchDocumentReference` operation is used to search for document reference resources in the Epic system.

## Properties

| Property Name           | Property Description                                                                                   |
|-------------------------|-------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`      | Whether to enable/disable URL rewrite in the response payload.                                       |
| `baseUrl`               | Optional base URL to be replaced in the response.                                                    |
| `serverUrl`             | Public server URL for URL rewrite.                                                                   |
| `author`                | Refine a search for DocumentReference resources by specifying a Reference corresponding to the author of the document. |
| `category`              | Refine a search for DocumentReference resources by category.                                           |
| `dateSearchBy`          | Refine a search by specifying a date or date range that corresponds to the document creation time.   |
| `dateUpperBound`        | Upper bound for the date range of document creation time in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]]). |
| `dateLowerBound`        | Lower bound for the date range of document creation time in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]]). |
| `date`                  | Refine a search by specifying a date or date range for document creation time in ISO format.          |
| `docstatus`             | Refine a search by specifying a docStatus. By default, all docStatuses are returned.                  |
| `encounter`             | Search for DocumentReference resources for a specific internal or external encounter.                |
| `patient`               | Search for DocumentReference resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `periodSearchBy`        | Refine a search for a given set of DocumentReferences by specifying a period of service documentation. |
| `periodUpperBound`      | Upper bound for the date range of the service documentation time in ISO format (YYYY[-MM[-DD]]).     |
| `periodLowerBound`      | Lower bound for the date range of the service documentation time in ISO format (YYYY[-MM[-DD]]).     |
| `period`                | Refine a search by specifying a date or date range for the service documentation time in ISO format.   |
| `status`                | Refine a search by specifying the status of the document.                                              |
| `subject`               | Search for DocumentReference resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `type`                  | Refine a search by specifying a type code to return only documents of that type. Use format: `type=<code>` to search all supported systems or `type=<system>|<code>` to refine the search. |
| `authenticator`         | Refine a search by specifying the authenticator.                                                        |
| `contenttype`           | Refine a search by specifying the content type.                                                        |
| `custodian`             | Refine a search by specifying the custodian.                                                          |
| `description`           | Refine a search by specifying the description of the document.                                         |
| `event`                 | Refine a search by specifying the event related to the document.                                       |
| `facility`              | Refine a search by specifying the facility associated with the document.                              |
| `format`                | Refine a search by specifying the format of the document.                                              |
| `identifier`            | Refine a search by specifying an identifier for the document.                                          |
| `language`              | Refine a search by specifying the language of the document.                                            |
| `related`               | Refine a search by specifying related resources.                                                       |
| `relatesto`             | Refine a search by specifying relationships to other documents.                                        |
| `relation`              | Refine a search by specifying the relation type.                                                       |
| `securityLabel`         | Refine a search by specifying the security label.                                                      |
| `setting`               | Refine a search by specifying the setting in which the document was created.                          |
| `id`                    | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`         | Number of results per page search parameter.                                                          |
| `countUpperBound`       | Upper bound for the number of results per page.                                                        |
| `countLowerBound`       | Lower bound for the number of results per page.                                                        |
| `count`                 | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                        |


# searchEncounter operation

The `searchEncounter` operation is used to search for encounter resources in the Epic system.

## Properties

| Property Name           | Property Description                                                                                   |
|-------------------------|-------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`      | Whether to enable/disable URL rewrite in the response payload.                                       |
| `baseUrl`               | Optional base URL to be replaced in the response.                                                    |
| `serverUrl`             | Public server URL for URL rewrite.                                                                   |
| `class`                 | Refine a search for Encounter resources by class. By default, all classes are returned.                |
| `dateSearchBy`          | Refine a search for Encounter resources by date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]]). |
| `dateUpperBound`        | Upper bound for the date range of Encounter resources in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]]). |
| `dateLowerBound`        | Lower bound for the date range of Encounter resources in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]]). |
| `date`                  | Refine a search for Encounter resources by date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]]). |
| `identifier`            | Search for Encounter resources by encounter identifier in the format `<code system>|<code>`.           |
| `onlyscannable`         | Refine a search to scannable encounters only. Use a value of "true" to only return scannable encounters. Can only be used when the application is launched from Hyperspace. |
| `patient`               | Search for Encounter resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `subject`               | Search for Encounter resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `account`               | Refine a search for Encounter resources by account.                                                    |
| `appointment`           | Refine a search for Encounter resources by appointment.                                                |
| `basedOn`               | Refine a search by specifying the encounter that is based on.                                          |
| `diagnosis`             | Refine a search for Encounter resources by diagnosis.                                                  |
| `episodeOfCare`         | Refine a search for Encounter resources by episode of care.                                             |
| `location`              | Refine a search for Encounter resources by location.                                                   |
| `locationPeriodSearchBy`| Refine a search by specifying a date or date range for the location period.                           |
| `locationPeriodUpperBound` | Upper bound for the date range of the location period in ISO format (YYYY[-MM[-DD]]).               |
| `locationPeriodLowerBound` | Lower bound for the date range of the location period in ISO format (YYYY[-MM[-DD]]).               |
| `locationPeriod`        | Refine a search by specifying a date or date range for the location period in ISO format.              |
| `partOf`                | Refine a search for Encounter resources that are part of another encounter.                           |
| `participant`           | Refine a search for Encounter resources by participant.                                                |
| `participantType`       | Refine a search by specifying the type of participant.                                                 |
| `practitioner`          | Refine a search for Encounter resources by practitioner.                                               |
| `reasonCode`            | Refine a search by specifying the reason code for the encounter.                                       |
| `reasonReference`       | Refine a search by specifying the reason reference for the encounter.                                  |
| `serviceProvider`       | Refine a search for Encounter resources by service provider.                                            |
| `specialArrangement`    | Refine a search by specifying any special arrangements for the encounter.                             |
| `status`                | Refine a search for Encounter resources by status.                                                      |
| `type`                  | Refine a search for Encounter resources by type.                                                        |
| `id`                    | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`         | Number of results per page search parameter.                                                          |
| `countUpperBound`       | Upper bound for the number of results per page.                                                        |
| `countLowerBound`       | Lower bound for the number of results per page.                                                        |
| `count`                 | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                        |


# searchEpisodeOfCare operation

The `searchEpisodeOfCare` operation is used to search for episode of care resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                      |
|--------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`              | Public server URL for URL rewrite.                                                                      |
| `patient`                | Search for EpisodeOfCare resources for a specified patient ID.                                           |
| `status`                 | Refine a search for EpisodeOfCare resources by status. Active, finished, and cancelled are the only supported statuses. |
| `type`                   | Refine a search for EpisodeOfCare resources by type.                                                     |
| `careManager`            | Refine a search for EpisodeOfCare resources by care manager.                                             |
| `condition`              | Refine a search for EpisodeOfCare resources by condition.                                                 |
| `dateSearchBy`           | Refine a search by specifying how the date should be used in the query.                                  |
| `dateUpperBound`         | Upper bound for the date range of EpisodeOfCare resources.                                                |
| `dateLowerBound`         | Lower bound for the date range of EpisodeOfCare resources.                                                |
| `date`                   | Refine a search for EpisodeOfCare resources by date.                                                      |
| `identifier`             | Search for EpisodeOfCare resources by identifier.                                                         |
| `incomingReferral`       | Refine a search for EpisodeOfCare resources by incoming referral.                                        |
| `organization`           | Refine a search for EpisodeOfCare resources by organization.                                              |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |

# searchExplanationOfBenefit operation

The `searchExplanationOfBenefit` operation is used to search for explanation of benefit resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                      |
|--------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`              | Public server URL for URL rewrite.                                                                      |
| `createdSearchBy`        | Refine a search by specifying how the creation date should be used in the query.                          |
| `createdUpperBound`      | Upper bound for the creation date of ExplanationOfBenefit resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `createdLowerBound`      | Lower bound for the creation date of ExplanationOfBenefit resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `created`                | Refine a search for ExplanationOfBenefit resources by creation date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `patient`                | Search for ExplanationOfBenefit resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `use`                    | Refine a search for ExplanationOfBenefit by use. By default, the search returns all uses. Use of claim and preauthorization are supported. |
| `careTeam`               | Refine a search for ExplanationOfBenefit resources by care team.                                           |
| `claim`                  | Refine a search for ExplanationOfBenefit resources by claim.                                               |
| `coverage`               | Refine a search for ExplanationOfBenefit resources by coverage.                                            |
| `detailUdi`              | Refine a search for ExplanationOfBenefit resources by detail UDI.                                          |
| `disposition`            | Refine a search for ExplanationOfBenefit resources by disposition.                                         |
| `encounter`              | Refine a search for ExplanationOfBenefit resources by encounter.                                          |
| `enterer`                | Refine a search for ExplanationOfBenefit resources by enterer.                                             |
| `facility`               | Refine a search for ExplanationOfBenefit resources by facility.                                            |
| `identifier`             | Refine a search for ExplanationOfBenefit resources by identifier.                                         |
| `itemUdi`                | Refine a search for ExplanationOfBenefit resources by item UDI.                                           |
| `payee`                  | Refine a search for ExplanationOfBenefit resources by payee.                                              |
| `procedureUdi`           | Refine a search for ExplanationOfBenefit resources by procedure UDI.                                      |
| `provider`               | Refine a search for ExplanationOfBenefit resources by provider.                                           |
| `status`                 | Refine a search for ExplanationOfBenefit resources by status.                                             |
| `subdetailUdi`           | Refine a search for ExplanationOfBenefit resources by subdetail UDI.                                      |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchFamilyMemberHistory operation

The `searchFamilyMemberHistory` operation is used to search for family member history resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                      |
|--------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`              | Public server URL for URL rewrite.                                                                      |
| `patient`                | Required: the patient whose family history you'd like to search.                                         |
| `code`                   | Refine a search for FamilyMemberHistory resources by code.                                                |
| `dateSearchBy`           | Refine a search by specifying how the date should be used in the query.                                   |
| `dateUpperBound`         | Upper bound for the date of FamilyMemberHistory resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `dateLowerBound`         | Lower bound for the date of FamilyMemberHistory resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `date`                   | Refine a search for FamilyMemberHistory resources by date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `identifier`             | Refine a search for FamilyMemberHistory resources by identifier.                                         |
| `instantiatesCanonical`  | Refine a search for FamilyMemberHistory resources by canonical URL.                                      |
| `relationship`           | Refine a search for FamilyMemberHistory resources by relationship.                                        |
| `sex`                    | Refine a search for FamilyMemberHistory resources by sex.                                                  |
| `status`                 | Refine a search for FamilyMemberHistory resources by status.                                               |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |

# searchFlag operation

The `searchFlag` operation is used to search for flag resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                      |
|--------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`              | Public server URL for URL rewrite.                                                                      |
| `category`               | Refine a search for Flag resources by category.                                                          |
| `encounter`              | Refine a search for Flag resources by encounter.                                                         |
| `patient`                | Search for Flag resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `status`                 | Refine a search for Flag resources by status.                                                             |
| `subject`                | Search for Flag resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `author`                 | Refine a search for Flag resources by author.                                                             |
| `dateSearchBy`           | Refine a search by specifying how the date should be used in the query.                                   |
| `dateUpperBound`         | Upper bound for the date of Flag resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `dateLowerBound`         | Lower bound for the date of Flag resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `date`                   | Refine a search for Flag resources by date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `identifier`             | Refine a search for Flag resources by identifier.                                                         |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchGoal operation

The `searchGoal` operation is used to search for goal resources in the Epic system.

## Properties

| Property Name             | Property Description                                                                                      |
|---------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`        | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                 | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`               | Public server URL for URL rewrite.                                                                      |
| `category`                | Refines a search by Goal category.                                                                       |
| `lifecycleStatus`         | Refines a search based on Goal lifecycle status.                                                          |
| `patient`                 | Search for Patient resources for a specific patient ID. You can use "patient" or "subject" equivalently but they can't be used at the same time for different references. |
| `subject`                 | Search for Patient resources for a specific patient ID. You can use "patient" or "subject" equivalently but they can't be used at the same time for different references. |
| `achievementStatus`       | Refine a search for Goal resources by achievement status.                                                  |
| `identifier`              | Refine a search for Goal resources by identifier.                                                         |
| `startDateSearchBy`       | Refine a search by specifying how the start date should be used in the query.                            |
| `startDateUpperBound`     | Upper bound for the start date of Goal resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `startDateLowerBound`     | Lower bound for the start date of Goal resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `startDate`               | Refine a search for Goal resources by start date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `targetDateSearchBy`      | Refine a search by specifying how the target date should be used in the query.                           |
| `targetDateUpperBound`    | Upper bound for the target date of Goal resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `targetDateLowerBound`    | Lower bound for the target date of Goal resources. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `targetDate`              | Refine a search for Goal resources by target date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]). Local server time is assumed if time zone information is not included. |
| `id`                      | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`           | Number of results per page search parameter.                                                             |
| `countUpperBound`         | Upper bound for the number of results per page.                                                           |
| `countLowerBound`         | Lower bound for the number of results per page.                                                           |
| `count`                   | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchGroup operation

The `searchGroup` operation is used to search for group resources in the Epic system.

## Properties

| Property Name             | Property Description                                                                                      |
|---------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`        | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                 | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`               | Public server URL for URL rewrite.                                                                      |
| `id`                      | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`           | Number of results per page search parameter.                                                             |
| `countUpperBound`         | Upper bound for the number of results per page.                                                           |
| `countLowerBound`         | Lower bound for the number of results per page.                                                           |
| `count`                   | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchImagingStudy operation

The `searchImagingStudy` operation is used to search for imaging study resources in the Epic system.

## Properties

| Property Name             | Property Description                                                                                      |
|---------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`        | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                 | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`               | Public server URL for URL rewrite.                                                                      |
| `identifier`              | Search for ImagingStudy resources by a study's identifier. Must be in the format `<code system>|<code>` or `<ID Type>|<ID>`. |
| `patient`                 | Search for ImagingStudy resources for a specified patient ID. Can be used interchangeably with `subject`. |
| `subject`                 | Search for ImagingStudy resources for a specified patient ID. Can be used interchangeably with `patient`. |
| `basedon`                 | Search for ImagingStudy resources based on the reference resource.                                      |
| `bodysite`                | Search for ImagingStudy resources based on the body site.                                                |
| `dicomClass`              | Search for ImagingStudy resources by DICOM class.                                                        |
| `encounter`               | Search for ImagingStudy resources associated with a specific encounter.                                   |
| `endpoint`                | Search for ImagingStudy resources by endpoint reference.                                                 |
| `instance`                | Search for ImagingStudy resources by instance reference.                                                  |
| `interpreter`             | Search for ImagingStudy resources by interpreter reference.                                               |
| `modality`                | Search for ImagingStudy resources by modality.                                                            |
| `performer`               | Search for ImagingStudy resources by performer reference.                                                 |
| `reason`                  | Search for ImagingStudy resources by reason.                                                              |
| `referrer`                | Search for ImagingStudy resources by referrer reference.                                                   |
| `series`                  | Search for ImagingStudy resources by series.                                                              |
| `startedSearchBy`         | Refine search for ImagingStudy resources by start date.                                                   |
| `startedUpperBound`       | Upper bound for the start date of ImagingStudy resources.                                                 |
| `startedLowerBound`       | Lower bound for the start date of ImagingStudy resources.                                                 |
| `started`                 | Search for ImagingStudy resources by start date.                                                           |
| `status`                  | Search for ImagingStudy resources by status.                                                              |
| `id`                      | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`           | Number of results per page search parameter.                                                              |
| `countUpperBound`         | Upper bound for the number of results per page.                                                           |
| `countLowerBound`         | Lower bound for the number of results per page.                                                           |
| `count`                   | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |

# searchImmunization operation

The `searchImmunization` operation is used to search for immunization resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                      |
|----------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`                | Public server URL for URL rewrite.                                                                      |
| `dateSearchBy`             | Refine search by vaccine administration date.                                                             |
| `dateUpperBound`           | Upper bound for the vaccine administration date. Enter dates in ISO format.                             |
| `dateLowerBound`           | Lower bound for the vaccine administration date. Enter dates in ISO format.                             |
| `date`                     | Vaccine administration date. Enter dates in ISO format.                                                  |
| `patient`                  | Search for Immunization resources for a specified patient ID.                                            |
| `status`                   | Refine a search for Immunization resources by status.                                                     |
| `identifier`               | Search for Immunization resources by identifier.                                                          |
| `location`                 | Search for Immunization resources by location.                                                            |
| `lotNumber`                | Search for Immunization resources by lot number.                                                          |
| `manufacturer`             | Search for Immunization resources by manufacturer.                                                         |
| `performer`                | Search for Immunization resources by performer.                                                           |
| `reaction`                 | Search for Immunization resources by reaction.                                                            |
| `reactionDateSearchBy`     | Refine search by reaction date.                                                                          |
| `reactionDateUpperBound`   | Upper bound for the reaction date. Enter dates in ISO format.                                            |
| `reactionDateLowerBound`   | Lower bound for the reaction date. Enter dates in ISO format.                                            |
| `reactionDate`             | Reaction date. Enter dates in ISO format.                                                                |
| `reasonCode`               | Search for Immunization resources by reason code.                                                         |
| `reasonReference`          | Search for Immunization resources by reason reference.                                                    |
| `series`                   | Search for Immunization resources by series.                                                              |
| `statusReason`             | Search for Immunization resources by status reason.                                                       |
| `targetDisease`            | Search for Immunization resources by target disease.                                                      |
| `vaccineCode`              | Search for Immunization resources by vaccine code.                                                        |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                             |
| `countUpperBound`          | Upper bound for the number of results per page.                                                          |
| `countLowerBound`          | Lower bound for the number of results per page.                                                          |
| `count`                    | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchImmunizationRecommendation operation

The `searchImmunizationRecommendation` operation is used to search for immunization recommendation resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                      |
|----------------------------|----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                          |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                       |
| `serverUrl`                | Public server URL for URL rewrite.                                                                      |
| `patient`                  | The FHIR id of a patient whose immunization recommendations you'd like to obtain. Only one of either patient or subject needs to be specified. |
| `dateSearchBy`             | Refine search by date.                                                                                   |
| `dateUpperBound`           | Upper bound for the date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]).                |
| `dateLowerBound`           | Lower bound for the date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]).                |
| `date`                     | Date for the immunization recommendation. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]).|
| `identifier`               | Search for ImmunizationRecommendation resources by identifier.                                          |
| `information`              | Search for ImmunizationRecommendation resources by information.                                        |
| `status`                   | Refine a search for ImmunizationRecommendation resources by status.                                      |
| `support`                  | Search for ImmunizationRecommendation resources by support.                                             |
| `targetDisease`            | Search for ImmunizationRecommendation resources by target disease.                                      |
| `vaccineType`              | Search for ImmunizationRecommendation resources by vaccine type.                                        |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                             |
| `countUpperBound`          | Upper bound for the number of results per page.                                                          |
| `countLowerBound`          | Lower bound for the number of results per page.                                                          |
| `count`                    | Number of results per page.                                                                            |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |

# searchList operation

The `searchList` operation is used to search for list resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `code`                     | Refine a search for List resources by list type. Accepted values include "medications," "allergies," "immunizations," "problems," "pedigree-list," "hospital-problems," and "patients." |
| `encounter`                | Refine a search for List resources by encounter.                                                           |
| `identifier`               | Refine a search for List resource by internal identifier. Only applies to the Patient List sub-resource. |
| `patient`                  | Refine a search for List resources by patient. You can use "patient" or "subject" equivalently, but not at the same time with different references. |
| `subject`                  | Refine a search for List resources by patient. You can use "patient" or "subject" equivalently, but not at the same time with different references. |
| `dateSearchBy`             | Refine search by date.                                                                                   |
| `dateUpperBound`           | Upper bound for the date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]).                 |
| `dateLowerBound`           | Lower bound for the date. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]).                 |
| `date`                     | Date for the list resource. Enter dates in ISO format (YYYY[-MM[-DD[THH:MM[:SS][TZ]]]]).               |
| `emptyReason`              | Search for List resources by the reason why the list is empty.                                           |
| `item`                     | Search for List resources by item.                                                                       |
| `notes`                    | Search for List resources by notes.                                                                      |
| `source`                   | Search for List resources by source.                                                                     |
| `status`                   | Refine a search for List resources by status.                                                             |
| `title`                    | Search for List resources by title.                                                                      |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                             |
| `countUpperBound`          | Upper bound for the number of results per page.                                                           |
| `countLowerBound`          | Lower bound for the number of results per page.                                                           |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |

# searchLocation operation

The `searchLocation` operation is used to search for location resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                                 |
|--------------------------|---------------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                                       |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                                    |
| `serverUrl`              | Public server URL for URL rewrite.                                                                                   |
| `type`                   | Search for Location resources with a specified location type.                                                        |
| `address`                | Search for Location resources by address.                                                                           |
| `addressCity`            | Search for Location resources by city in the address.                                                                |
| `addressCountry`         | Search for Location resources by country in the address.                                                             |
| `addressPostalcode`      | Search for Location resources by postal code in the address.                                                          |
| `addressState`           | Search for Location resources by state in the address.                                                               |
| `addressUse`             | Search for Location resources by the use of the address.                                                             |
| `endpoint`               | Search for Location resources by endpoint.                                                                           |
| `identifier`             | Search for Location resources by identifier.                                                                        |
| `name`                   | Search for Location resources by name.                                                                             |
| `operationalStatus`      | Search for Location resources by operational status.                                                                  |
| `organization`           | Search for Location resources by organization.                                                                      |
| `partof`                 | Search for Location resources by part of a larger location.                                                           |
| `status`                 | Search for Location resources by status.                                                                            |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored.      |
| `countSearchBy`          | Number of results per page search parameter.                                                                        |
| `countUpperBound`        | Upper bound for the number of results per page.                                                                      |
| `countLowerBound`        | Lower bound for the number of results per page.                                                                      |
| `count`                  | Number of results per page.                                                                                        |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                         |


# searchMeasure operation

The `searchMeasure` operation is used to search for measure resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                       |
|--------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`              | Public server URL for URL rewrite.                                                                       |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchMeasureReport operation

The `searchMeasureReport` operation is used to search for measure report resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                       |
|--------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`              | Public server URL for URL rewrite.                                                                       |
| `epicGroupId`            | Identifier for the group in the EPIC system.                                                              |
| `patient`                | Refine search for MeasureReport resources by patient.                                                     |
| `subject`                | Refine search for MeasureReport resources by subject.                                                     |
| `dateSearchBy`           | Specify the date parameter for the search.                                                                |
| `dateUpperBound`         | Upper bound for the date search parameter.                                                                |
| `dateLowerBound`         | Lower bound for the date search parameter.                                                                |
| `date`                   | Date parameter for the search.                                                                           |
| `evaluatedResource`      | Refine search for MeasureReport resources by evaluated resource.                                          |
| `identifier`             | Refine search for MeasureReport resources by identifier.                                                   |
| `measure`                | Refine search for MeasureReport resources by measure.                                                      |
| `periodSearchBy`         | Specify the period parameter for the search.                                                              |
| `periodUpperBound`       | Upper bound for the period search parameter.                                                              |
| `periodLowerBound`       | Lower bound for the period search parameter.                                                              |
| `period`                 | Period parameter for the search.                                                                         |
| `reporter`               | Refine search for MeasureReport resources by reporter.                                                     |
| `status`                 | Refine search for MeasureReport resources by status.                                                       |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchMedia operation

The `searchMedia` operation is used to search for media resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                       |
|--------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`              | Public server URL for URL rewrite.                                                                       |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchMedication operation

The `searchMedication` operation is used to search for medication resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                       |
|--------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`              | Public server URL for URL rewrite.                                                                       |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                             |
| `countUpperBound`        | Upper bound for the number of results per page.                                                           |
| `countLowerBound`        | Lower bound for the number of results per page.                                                           |
| `count`                  | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchMedicationAdministration operation

The `searchMedicationAdministration` operation is used to search for medication administration resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `context`                  | Refine a search for MedicationAdministration resources with one or more linked references.                |
| `effectiveTimeSearchBy`    | Search for MedicationAdministration resources by a specified date or date range for the administration.   |
| `effectiveTimeUpperBound`  | Upper bound for the date or range of dates for the administration.                                        |
| `effectiveTimeLowerBound`  | Lower bound for the date or range of dates for the administration.                                        |
| `effectiveTime`            | Date or range of dates for the administration.                                                            |
| `patient`                  | Search for MedicationAdministration resources for a specified patient ID.                                 |
| `performer`                | Refine a search by one or more associated references.                                                      |
| `request`                  | Refine a search by associated reference.                                                                   |
| `status`                   | Refine a search by one or more statuses.                                                                   |
| `subject`                  | Search for MedicationAdministration resources for a specified patient ID.                                 |
| `code`                     | Refine a search by medication code.                                                                        |
| `device`                   | Refine a search by device.                                                                                |
| `identifier`               | Refine a search by internal identifier.                                                                    |
| `medication`               | Refine a search by medication.                                                                            |
| `reasonGiven`              | Refine a search by reason for administration.                                                              |
| `reasonNotGiven`           | Refine a search by reason for not administering.                                                           |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchMedicationDispense operation

The `searchMedicationDispense` operation is used to search for medication dispense resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `patient`                  | Search for MedicationDispense resources for a specified patient ID. You can use `patient` or `subject` equivalently, but not at the same time for different references. |
| `subject`                  | Search for MedicationDispense resources for a specified patient ID. You can use `patient` or `subject` equivalently, but not at the same time for different references. |
| `code`                     | Refine a search by medication code.                                                                        |
| `context`                  | Refine a search by context.                                                                              |
| `destination`              | Refine a search by destination.                                                                          |
| `identifier`               | Refine a search by internal identifier.                                                                    |
| `medication`               | Refine a search by medication.                                                                            |
| `performer`                | Refine a search by performer.                                                                            |
| `prescription`             | Refine a search by associated prescription.                                                               |
| `receiver`                 | Refine a search by receiver.                                                                              |
| `responsibleparty`         | Refine a search by responsible party.                                                                      |
| `status`                   | Refine a search by status.                                                                               |
| `type`                     | Refine a search by type.                                                                                  |
| `whenhandedoverSearchBy`   | Search for MedicationDispense resources by the date or range of dates when handed over.                    |
| `whenhandedoverUpperBound` | Upper bound for the date or range of dates when handed over.                                              |
| `whenhandedoverLowerBound` | Lower bound for the date or range of dates when handed over.                                              |
| `whenhandedover`           | Date or range of dates when handed over.                                                                  |
| `whenpreparedSearchBy`     | Search for MedicationDispense resources by the date or range of dates when prepared.                       |
| `whenpreparedUpperBound`   | Upper bound for the date or range of dates when prepared.                                                 |
| `whenpreparedLowerBound`   | Lower bound for the date or range of dates when prepared.                                                 |
| `whenprepared`             | Date or range of dates when prepared.                                                                     |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchMedicationRequest operation

The `searchMedicationRequest` operation is used to search for medication request resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `category`                 | Refine a search for MedicationRequest resources by category. By default, the search returns all categories. Categories of inpatient, outpatient, community, and discharge are supported. |
| `dateSearchBy`             | Refine a search by date or range of dates for when the medication was activated.                          |
| `dateUpperBound`           | Upper bound for the date or range of dates for when the medication was activated.                         |
| `dateLowerBound`           | Lower bound for the date or range of dates for when the medication was activated.                         |
| `date`                     | Date or range of dates for when the medication was activated.                                             |
| `intent`                   | Refine a search by one or more intents.                                                                   |
| `patient`                  | Search for MedicationRequest resources for a specified patient ID. You can use `patient` or `subject` equivalently, but not at the same time for different references. |
| `status`                   | Refine a search by one or more statuses.                                                                  |
| `subject`                  | Search for MedicationRequest resources for a specified patient ID. You can use `patient` or `subject` equivalently, but not at the same time for different references. |
| `authoredonSearchBy`       | Refine a search by date or range of dates when the request was authored.                                  |
| `authoredonUpperBound`     | Upper bound for the date or range of dates when the request was authored.                                 |
| `authoredonLowerBound`     | Lower bound for the date or range of dates when the request was authored.                                 |
| `authoredon`               | Date or range of dates when the request was authored.                                                     |
| `code`                     | Refine a search by medication code.                                                                        |
| `encounter`                | Refine a search by associated encounter.                                                                  |
| `identifier`               | Refine a search by internal identifier.                                                                    |
| `intendedDispenser`        | Refine a search by intended dispenser.                                                                     |
| `intendedPerformer`        | Refine a search by intended performer.                                                                     |
| `intendedPerformertype`    | Refine a search by intended performer type.                                                               |
| `medication`               | Refine a search by medication.                                                                            |
| `priority`                 | Refine a search by priority.                                                                             |
| `requester`                | Refine a search by requester.                                                                            |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchNutritionOrder operation

The `searchNutritionOrder` operation is used to search for nutrition order resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `patient`                  | Search for NutritionOrder resources for the specified patient ID.                                         |
| `additive`                 | Refine a search by additive ingredients.                                                                   |
| `datetimeSearchBy`         | Refine a search by date or range of dates when the nutrition order was requested or modified.              |
| `datetimeUpperBound`       | Upper bound for the date or range of dates when the nutrition order was requested or modified.             |
| `datetimeLowerBound`       | Lower bound for the date or range of dates when the nutrition order was requested or modified.             |
| `datetime`                 | Date or range of dates when the nutrition order was requested or modified.                                |
| `encounter`                | Refine a search by associated encounter.                                                                  |
| `formula`                  | Refine a search by the formula used in the nutrition order.                                                |
| `identifier`               | Refine a search by internal identifier.                                                                    |
| `instantiatesCanonical`    | Refine a search by canonical URL that this nutrition order is based on.                                    |
| `oraldiet`                 | Refine a search by oral diet details.                                                                      |
| `provider`                 | Refine a search by the provider of the nutrition order.                                                    |
| `status`                   | Refine a search by status of the nutrition order.                                                         |
| `supplement`               | Refine a search by supplement details.                                                                     |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchObservation operation

The `searchObservation` operation is used to search for observation resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `basedOn`                  | Refine a search for Observation resources by specifying a Reference associated with the Observation.      |
| `category`                 | Refine a search for Observation resources by category or SNOMED code. Categories include various types like laboratory, vital-signs, etc., and SNOMED codes are also supported. |
| `code`                     | Refine a search for Observation resources by LOINC code, SNOMED code, flowsheet row IDs, or SmartData Identifiers. |
| `dateSearchBy`             | Refine a search by date or date range that an Observation was resulted or recorded.                      |
| `dateUpperBound`           | Upper bound for the date or date range when the Observation was resulted or recorded.                    |
| `dateLowerBound`           | Lower bound for the date or date range when the Observation was resulted or recorded.                    |
| `date`                     | Date or range of dates when the Observation was resulted or recorded.                                    |
| `focus`                    | Refine a search for Observation resources by specifying a Reference associated with the Observation.      |
| `issuedSearchBy`           | Refine a search by date or date range that an Observation was made available.                             |
| `issuedUpperBound`         | Upper bound for the date or date range that an Observation was made available.                           |
| `issuedLowerBound`         | Lower bound for the date or date range that an Observation was made available.                           |
| `issued`                   | Date or range of dates when the Observation was made available.                                           |
| `patient`                  | Search for Observation resources for a specified patient ID.                                              |
| `subject`                  | Search for Observation resources for a specified patient ID.                                              |
| `comboCode`                | Refine a search by combo code.                                                                            |
| `comboDataAbsentReason`    | Refine a search by data absent reason for combo.                                                          |
| `comboValueConcept`        | Refine a search by combo value concept.                                                                    |
| `componentCode`            | Refine a search by component code.                                                                        |
| `componentDataAbsentReason`| Refine a search by data absent reason for component.                                                       |
| `componentValueConcept`    | Refine a search by component value concept.                                                                |
| `dataAbsentReason`         | Refine a search by reason data is absent.                                                                  |
| `derivedFrom`              | Refine a search by resources that this Observation is derived from.                                        |
| `device`                   | Refine a search by device used in the observation.                                                          |
| `encounter`                | Refine a search by associated encounter.                                                                  |
| `hasMember`                | Refine a search by Observation resources that are part of a larger set of Observations.                   |
| `identifier`               | Refine a search by internal identifier.                                                                    |
| `method`                   | Refine a search by method used in the Observation.                                                         |
| `partOf`                   | Refine a search by Observation resources that are part of another Observation.                           |
| `performer`                | Refine a search by performer of the Observation.                                                           |
| `specimen`                 | Refine a search by specimen used in the Observation.                                                        |
| `status`                   | Refine a search by status of the Observation.                                                             |
| `valueConcept`             | Refine a search by value concept of the Observation.                                                       |
| `valueDateSearchBy`        | Refine a search by date or date range for the value of the Observation.                                   |
| `valueDateUpperBound`      | Upper bound for the date or date range of the Observation value.                                          |
| `valueDateLowerBound`      | Lower bound for the date or date range of the Observation value.                                          |
| `valueDate`                | Date or range of dates for the Observation value.                                                          |
| `valueString`              | Refine a search by string value of the Observation.                                                        |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchOrganization operation

The `searchOrganization` operation is used to search for organization resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchPatient operation

The `searchPatient` operation is used to search for patient resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `address`                  | Search for Patient resources using an address string.                                                     |
| `addressCity`              | Search for Patient resources using the city for a patient's home address.                                |
| `addressPostalcode`        | Search for Patient resources using the postal code for a patient's home address.                          |
| `addressState`             | Search for Patient resources using the state for a patient's home address.                               |
| `birthdateSearchBy`        | Search for Patient resources by date of birth.                                                            |
| `birthdateUpperBound`      | Search for Patient resources using a date of birth in ISO format (YYYY-MM-DD).                            |
| `birthdateLowerBound`      | Search for Patient resources using a date of birth in ISO format (YYYY-MM-DD).                            |
| `birthdate`                | Search for Patient resources using a date of birth in ISO format (YYYY-MM-DD).                            |
| `docType`                  | Search for Patient resources using Singapore document type.                                                |
| `family`                   | Search for Patient resources by family (last) name.                                                        |
| `gender`                   | Search for Patient resources using gender codes: female, male, other, or unknown.                         |
| `given`                    | Search for Patient resources by given (first) name.                                                        |
| `identifier`               | Search for Patient resources by a patient's identifier.                                                    |
| `legalSex`                 | Search for Patient resources using gender codes: female, male, nonbinary, x, other, or unknown.            |
| `name`                     | Search for Patient resources by a patient's name.                                                         |
| `ownName`                  | Search for Patient resources by patient's own last name.                                                   |
| `ownPrefix`                | Search for Patient resources by patient's own last name prefix.                                           |
| `partnerName`              | Search for Patient resources by patient's spouse's last name.                                             |
| `partnerPrefix`            | Search for Patient resources by patient's spouse's last name prefix.                                      |
| `telecom`                  | Search for Patient resources using a patient's home phone number, cell phone number, or email address.    |
| `active`                   | Search for active or inactive Patient resources.                                                           |
| `addressCountry`           | Search for Patient resources using the country in the address.                                             |
| `addressUse`               | Search for Patient resources using the address use (e.g., home, work).                                    |
| `deathDateSearchBy`        | Search for Patient resources by death date.                                                                |
| `deathDateUpperBound`      | Search for Patient resources using a death date in ISO format (YYYY-MM-DD).                               |
| `deathDateLowerBound`      | Search for Patient resources using a death date in ISO format (YYYY-MM-DD).                               |
| `deathDate`                | Search for Patient resources using a death date in ISO format (YYYY-MM-DD).                               |
| `email`                    | Search for Patient resources using email address.                                                         |
| `generalPractitioner`      | Search for Patient resources by general practitioner.                                                      |
| `language`                 | Search for Patient resources by language.                                                                  |
| `link`                     | Search for Patient resources using the link.                                                               |
| `organization`             | Search for Patient resources by organization.                                                             |
| `phone`                    | Search for Patient resources using phone number.                                                           |
| `phonetic`                 | Search for Patient resources using phonetic representation of names.                                       |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchPractitioner operation

The `searchPractitioner` operation is used to search for practitioner resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                       |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                           |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                        |
| `serverUrl`                | Public server URL for URL rewrite.                                                                       |
| `address`                  | Any part of an address (street, city, etc.) where a practitioner can be visited.                         |
| `addressCity`              | The city where a practitioner can be visited.                                                             |
| `addressPostalcode`        | The zip code where a practitioner can be found.                                                           |
| `addressState`             | The state where a practitioner can be found.                                                             |
| `family`                   | A practitioner's family (last) name.                                                                      |
| `given`                    | A practitioner's given (first) name.                                                                      |
| `identifier`               | A practitioner's identifier in the format `<code system>|<code>`.                                        |
| `name`                     | Any part of a practitioner's name. For full names, format should be first last.                           |
| `active`                   | Search for active or inactive Practitioner resources.                                                      |
| `addressCountry`           | The country where a practitioner can be found.                                                            |
| `addressUse`               | The use of the address (e.g., home, work).                                                                |
| `communication`            | Search for Practitioner resources using communication details.                                             |
| `email`                    | Search for Practitioner resources using email address.                                                     |
| `gender`                   | Search for Practitioner resources using gender codes.                                                      |
| `phone`                    | Search for Practitioner resources using phone number.                                                      |
| `phonetic`                 | Search for Practitioner resources using phonetic representation of names.                                 |
| `telecom`                  | Search for Practitioner resources using telephone or other contact details.                                |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                              |
| `countUpperBound`          | Upper bound for the number of results per page.                                                            |
| `countLowerBound`          | Lower bound for the number of results per page.                                                            |
| `count`                    | Number of results per page.                                                                             |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                            |


# searchPractitionerRole operation

The `searchPractitionerRole` operation is used to search for practitioner role resources in the Epic system.

## Properties

| Property Name         | Property Description                                                                                          |
|-----------------------|--------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`    | Whether to enable/disable URL rewrite in the response payload.                                              |
| `baseUrl`             | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`           | Public server URL for URL rewrite.                                                                          |
| `email`               | Refine a search for a PractitionerRole by entering a valid email address. Code system is ignored.              |
| `identifier`          | Search for PractitionerRoles using identifiers. A code system is required. The code must be prepended with URN:OID. Some codes may need to be URL encoded prior to query. |
| `location`            | Search for PractitionerRoles using a Location ID. Only the first instance of this parameter is respected.     |
| `organization`        | Search for PractitionerRoles using an Organization ID. Only the first instance of this parameter is respected. |
| `phone`               | Refine a search for a PractitionerRole by entering a valid phone number. Code system is ignored.              |
| `practitioner`        | Search for PractitionerRoles for a specified Practitioner ID. Only the first instance of this parameter is respected. |
| `role`                | Refine a search for a PractitionerRole by entering a valid role. System must be included.                    |
| `specialty`           | Search for PractitionerRoles for a given specialty. A code system is required. Depending on the organization, NUCC may be supported. |
| `telecom`             | Refine a search for a PractitionerRole for a specific telecom. System must be specified as either 'phone' or 'email'. |
| `active`              | Search for active or inactive PractitionerRole resources.                                                     |
| `dateSearchBy`        | Refine a search by date criteria.                                                                            |
| `dateUpperBound`      | Refine a search by specifying an upper date boundary.                                                         |
| `dateLowerBound`      | Refine a search by specifying a lower date boundary.                                                          |
| `date`                | Refine a search by specifying a date.                                                                         |
| `endpoint`            | Refine a search using endpoint details.                                                                       |
| `service`             | Refine a search using service details.                                                                        |
| `id`                  | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`       | Number of results per page search parameter.                                                                 |
| `countUpperBound`     | Upper bound for the number of results per page.                                                               |
| `countLowerBound`     | Lower bound for the number of results per page.                                                               |
| `count`               | Number of results per page.                                                                                  |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                           |


# searchProcedure operation

The `searchProcedure` operation is used to search for procedure resources in the Epic system.

## Properties

| Property Name         | Property Description                                                                                         |
|-----------------------|-------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`    | Whether to enable/disable URL rewrite in the response payload.                                             |
| `baseUrl`             | Optional base URL to be replaced in the response.                                                            |
| `serverUrl`           | Public server URL for URL rewrite.                                                                           |
| `category`            | Refine a search for Procedure resources by category. Only the following values are supported: 103693007 (diagnostic procedures), 387713003 (surgical procedures), 9632001 (nursing procedures, Netherlands only), and 225317005 or freedom-restricting-intervention (restricting intervention, Netherlands only). |
| `code`                | Refine a search for Procedure based on code.                                                                 |
| `dateSearchBy`        | Refine a search by date criteria.                                                                           |
| `dateUpperBound`      | Refine a search for Procedure resources by specifying a date or date range that a Procedure was resulted. Enter dates in ISO format (YYYY[-MM[-DD]]). |
| `dateLowerBound`      | Refine a search for Procedure resources by specifying a date or date range that a Procedure was resulted. Enter dates in ISO format (YYYY[-MM[-DD]]). |
| `date`                | Refine a search for Procedure resources by specifying a date or date range that a Procedure was resulted. Enter dates in ISO format (YYYY[-MM[-DD]]). |
| `identifier`          | Refine a search for Procedure by identifier.                                                                 |
| `patient`             | Search for Procedure resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `subject`             | Search for Procedure resources for a specified patient ID. You can use "patient" or "subject" equivalently, but they cannot be used at the same time for different references. |
| `basedOn`             | Refine a search based on the related request or plan.                                                         |
| `encounter`           | Refine a search based on the associated encounter.                                                           |
| `instantiatesCanonical` | Refine a search based on canonical reference.                                                               |
| `location`            | Refine a search based on the location where the procedure was performed.                                     |
| `partOf`              | Refine a search based on related procedures or activities.                                                   |
| `performer`           | Refine a search based on the performer of the procedure.                                                      |
| `reasonCode`          | Refine a search based on the reason code for the procedure.                                                    |
| `reasonReference`     | Refine a search based on the reference to the reason for the procedure.                                       |
| `status`              | Refine a search based on the status of the procedure.                                                         |
| `id`                  | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`       | Number of results per page search parameter.                                                                 |
| `countUpperBound`     | Upper bound for the number of results per page.                                                               |
| `countLowerBound`     | Lower bound for the number of results per page.                                                               |
| `count`               | Number of results per page.                                                                                  |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                           |


# searchQuestionnaire operation

The `searchQuestionnaire` operation is used to search for questionnaire resources in the Epic system.

## Properties

| Property Name         | Property Description                                                                                         |
|-----------------------|-------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`    | Whether to enable/disable URL rewrite in the response payload.                                             |
| `baseUrl`             | Optional base URL to be replaced in the response.                                                            |
| `serverUrl`           | Public server URL for URL rewrite.                                                                           |
| `id`                  | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`       | Number of results per page search parameter.                                                                 |
| `countUpperBound`     | Upper bound for the number of results per page.                                                              |
| `countLowerBound`     | Lower bound for the number of results per page.                                                              |
| `count`               | Number of results per page.                                                                                  |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                           |


# searchQuestionnaireResponse operation

The `searchQuestionnaireResponse` operation is used to search for questionnaire response resources in the Epic system.

## Properties

| Property Name         | Property Description                                                                                           |
|-----------------------|---------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`    | Whether to enable/disable URL rewrite in the response payload.                                               |
| `baseUrl`             | Optional base URL to be replaced in the response.                                                              |
| `serverUrl`           | Public server URL for URL rewrite.                                                                             |
| `encounter`           | Search for QuestionnaireResponses by encounter.                                                                |
| `patient`             | Search for QuestionnaireResponses for a specified patient. You can also use "subject" equivalently.              |
| `subject`             | Search for QuestionnaireResponses for a specified patient or research subject. You can use "patient" equivalently if subject references a patient. |
| `author`              | Search for QuestionnaireResponses by the author.                                                               |
| `authoredSearchBy`    | Refine search by authored date.                                                                                |
| `authoredUpperBound`  | Upper bound for the authored date range.                                                                       |
| `authoredLowerBound`  | Lower bound for the authored date range.                                                                       |
| `authored`            | Refine search by authored date.                                                                               |
| `basedOn`             | Search for QuestionnaireResponses based on the related resources.                                               |
| `identifier`          | Search for QuestionnaireResponses using an identifier.                                                         |
| `partOf`              | Search for QuestionnaireResponses as part of another resource.                                                 |
| `questionnaire`       | Search for QuestionnaireResponses related to a specific Questionnaire.                                         |
| `source`              | Search for QuestionnaireResponses by the source.                                                                |
| `status`              | Search for QuestionnaireResponses by status.                                                                    |
| `id`                  | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`       | Number of results per page search parameter.                                                                   |
| `countUpperBound`     | Upper bound for the number of results per page.                                                                |
| `countLowerBound`     | Lower bound for the number of results per page.                                                                |
| `count`               | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                           |


# searchRelatedPerson operation

The `searchRelatedPerson` operation is used to search for related person resources in the Epic system.

## Properties

| Property Name         | Property Description                                                                                           |
|-----------------------|---------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`    | Whether to enable/disable URL rewrite in the response payload.                                               |
| `baseUrl`             | Optional base URL to be replaced in the response.                                                              |
| `serverUrl`           | Public server URL for URL rewrite.                                                                             |
| `id`                  | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`       | Number of results per page search parameter.                                                                   |
| `countUpperBound`     | Upper bound for the number of results per page.                                                                |
| `countLowerBound`     | Lower bound for the number of results per page.                                                                |
| `count`               | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                           |

# searchRequestGroup operation

The `searchRequestGroup` operation is used to search for request group resources in the Epic system.

## Properties

| Property Name              | Property Description                                                                                           |
|----------------------------|---------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`         | Whether to enable/disable URL rewrite in the response payload.                                               |
| `baseUrl`                  | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`                | Public server URL for URL rewrite.                                                                            |
| `id`                       | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`            | Number of results per page search parameter.                                                                  |
| `countUpperBound`          | Upper bound for the number of results per page.                                                               |
| `countLowerBound`          | Lower bound for the number of results per page.                                                               |
| `count`                    | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                              |


# searchResearchStudy operation

The `searchRequestStudy` operation is used to search for research study resources in the Epic system.

## Properties

| Property Name            | Property Description                                                                                           |
|--------------------------|---------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`       | Whether to enable/disable URL rewrite in the response payload.                                               |
| `baseUrl`                | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`              | Public server URL for URL rewrite.                                                                            |
| `identifier`             | Search for the ResearchStudy resource for a specified study code or NCT number.                               |
| `status`                 | Search for the ResearchStudy resource for a specified status.                                                  |
| `category`               | Search for the ResearchStudy resource by category.                                                             |
| `dateSearchBy`           | Refine search by date or date range.                                                                           |
| `dateUpperBound`         | Upper bound for the date range search.                                                                        |
| `dateLowerBound`         | Lower bound for the date range search.                                                                        |
| `date`                   | Date or date range for the search.                                                                            |
| `focus`                  | Search by the focus of the research study.                                                                    |
| `keyword`                | Search by keyword associated with the research study.                                                         |
| `location`               | Search for the ResearchStudy resource by location.                                                            |
| `partof`                 | Search for the ResearchStudy resource as part of another study.                                                |
| `principalinvestigator`  | Search by the principal investigator of the research study.                                                    |
| `protocol`               | Search by the protocol associated with the research study.                                                     |
| `site`                   | Search by the site of the research study.                                                                     |
| `sponsor`                | Search by the sponsor of the research study.                                                                  |
| `title`                  | Search by the title of the research study.                                                                    |
| `id`                     | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`          | Number of results per page search parameter.                                                                  |
| `countUpperBound`        | Upper bound for the number of results per page.                                                               |
| `countLowerBound`        | Lower bound for the number of results per page.                                                               |
| `count`                  | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                              |


# searchResearchSubject operation

The `searchResearchSubject` operation is used to search for research subject resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                                           |
|------------------------------|---------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                                               |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`                  | Public server URL for URL rewrite.                                                                            |
| `patient`                    | Search for the ResearchSubject resources related to a specified patient.                                      |
| `status`                     | Search for the ResearchSubject resources for a specified status.                                               |
| `study`                      | Search for the ResearchSubject resources related to a specified study.                                        |
| `dateSearchBy`               | Refine search by date or date range.                                                                           |
| `dateUpperBound`             | Upper bound for the date range search.                                                                        |
| `dateLowerBound`             | Lower bound for the date range search.                                                                        |
| `date`                       | Date or date range for the search.                                                                            |
| `identifier`                 | Search for the ResearchSubject resources by identifier.                                                       |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | Number of results per page search parameter.                                                                  |
| `countUpperBound`            | Upper bound for the number of results per page.                                                               |
| `countLowerBound`            | Lower bound for the number of results per page.                                                               |
| `count`                      | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                 |


# searchServiceRequest operation

The `searchServiceRequest` operation is used to search for service request resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                                          |
|------------------------------|--------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                                                |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`                  | Public server URL for URL rewrite.                                                                            |
| `authoredSearchBy`           | A date parameter to filter by authored dates.                                                                 |
| `authoredUpperBound`         | Upper bound of the authored date to refine the search.                                                        |
| `authoredLowerBound`         | Lower bound of the authored date to refine the search.                                                        |
| `authored`                   | Authored date to refine the search.                                                                           |
| `category`                   | Refine a search for ServiceRequests of a particular category.                                                 |
| `code`                       | Refine a search for ServiceRequest based on code.                                                             |
| `encounter`                  | Search for ServiceRequest resources for specific encounters.                                                  |
| `identifier`                 | Refine a search for ServiceRequest by identifier.                                                             |
| `onlyscannable`              | Refine a search for ServiceRequest resources to scannable only.                                               |
| `patient`                    | Search ServiceRequest resources for a specified patient ID.                                                   |
| `requester`                  | Refine a search for ServiceRequest resources by individual making the request.                                |
| `status`                     | Refine a search for ServiceRequest resources by status.                                                       |
| `subject`                    | Search ServiceRequest resources for a specified patient ID.                                                   |
| `basedOn`                    | Plan/proposal/order fulfilled by this request.                                                                |
| `bodySite`                   | Where on the subject is the procedure (e.g. location) to be performed.                                        |
| `instantiatesCanonical`      | Instantiates FHIR protocol or definition.                                                                     |
| `intent`                     | Refine a search for ServiceRequests with a specific intent.                                                   |
| `occurrenceSearchBy`         | A date parameter to filter by occurrence dates.                                                               |
| `occurrenceUpperBound`       | Upper bound of the occurrence date to refine the search.                                                      |
| `occurrenceLowerBound`       | Lower bound of the occurrence date to refine the search.                                                      |
| `occurrence`                 | Occurrence date to refine the search.                                                                         |
| `performer`                  | Who is responsible for fulfilling the request.                                                                |
| `performerType`              | The type of performer requested.                                                                              |
| `priority`                   | The priority of the request.                                                                                  |
| `replaces`                   | What request replaces.                                                                                        |
| `requisition`                | Composite request this is part of.                                                                            |
| `specimen`                   | Specimen to be tested.                                                                                        |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | A number parameter to filter by count.                                                                        |
| `countUpperBound`            | Number of results per page.                                                                                   |
| `countLowerBound`            | Number of results per page.                                                                                   |
| `count`                      | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                |


# serviceSpecimen operation

The `serviceSpecimen` operation is used to search for specimen resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                                          |
|------------------------------|--------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                                                |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`                  | Public server URL for URL rewrite.                                                                            |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | A number parameter to filter by count.                                                                        |
| `countUpperBound`            | Number of results per page.                                                                                   |
| `countLowerBound`            | Number of results per page.                                                                                   |
| `count`                      | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                |


# searchSubstance operation

The `searchSubstance` operation is used to search for substance resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                                          |
|------------------------------|--------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                                                |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`                  | Public server URL for URL rewrite.                                                                            |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `identifier`                 | An identifier for the substance.                                                                               |
| `category`                   | The category of the substance.                                                                                 |
| `code`                       | The code that identifies the substance.                                                                        |
| `status`                     | The status of the substance.                                                                                   |
| `countSearchBy`              | A number parameter to filter by count.                                                                        |
| `countUpperBound`            | Number of results per page.                                                                                   |
| `countLowerBound`            | Number of results per page.                                                                                   |
| `count`                      | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                |


# searchTask operation

The `searchTask` operation is used to search for task resources in the Epic system.

## Properties

| Property Name                | Property Description                                                                                          |
|------------------------------|--------------------------------------------------------------------------------------------------------------|
| `enableUrlRewrite`           | Whether to enable/disable URL rewrite in the response payload.                                                |
| `baseUrl`                    | Optional base URL to be replaced in the response.                                                             |
| `serverUrl`                  | Public server URL for URL rewrite.                                                                            |
| `code`                       | Specify `community-resource` for CRRN tasks, `episode-checklist` for Episode Checklist tasks. When nothing is specified, all valid tasks are returned. |
| `encounter`                  | Further refine the search for a task by specifying the encounter associated with the task.                    |
| `focus`                      | The focus of the task.                                                                                        |
| `patient`                    | Search for Task resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `status`                     | Restrict the search for tasks based on task status.                                                           |
| `subject`                    | Search for Task resources for a specified patient ID. You can use `patient` or `subject` equivalently, but they cannot be used at the same time for different references. |
| `authoredOnSearchBy`         | A date parameter to search by authoredOn.                                                                     |
| `authoredOnUpperBound`       | Refine a search for tasks by specifying the upper bound of the authoredOn date.                               |
| `authoredOnLowerBound`       | Refine a search for tasks by specifying the lower bound of the authoredOn date.                               |
| `authoredOn`                 | Refine a search for tasks by specifying the authoredOn date.                                                  |
| `basedOn`                    | The plan, proposal or order that is fulfilled in whole or in part by this Task.                               |
| `businessStatus`             | The business status of the task.                                                                              |
| `groupIdentifier`            | A shared identifier for all tasks that are part of the same group.                                            |
| `identifier`                 | An identifier for the task.                                                                                   |
| `intent`                     | Indicates the level of authority/intentionality associated with the Task and where the Task fits into the workflow chain. |
| `modifiedSearchBy`           | A date parameter to search by modified.                                                                       |
| `modifiedUpperBound`         | Refine a search for tasks by specifying the upper bound of the modified date.                                 |
| `modifiedLowerBound`         | Refine a search for tasks by specifying the lower bound of the modified date.                                 |
| `modified`                   | Refine a search for tasks by specifying the modified date.                                                    |
| `owner`                      | Individual responsible for the task.                                                                          |
| `partOf`                     | Search for tasks that are part of a larger task.                                                              |
| `performer`                  | Search for tasks by performer.                                                                                |
| `periodSearchBy`             | A date parameter to search by period.                                                                         |
| `periodUpperBound`           | Refine a search for tasks by specifying the upper bound of the period date.                                   |
| `periodLowerBound`           | Refine a search for tasks by specifying the lower bound of the period date.                                   |
| `period`                     | Refine a search for tasks by specifying the period date.                                                      |
| `priority`                   | The priority of the task.                                                                                     |
| `requester`                  | The creator of the task.                                                                                      |
| `id`                         | FHIR resource IDs for the desired resources. If `_id` is used in a search, all other parameters will be ignored. |
| `countSearchBy`              | A number parameter to filter by count.                                                                        |
| `countUpperBound`            | Number of results per page.                                                                                   |
| `countLowerBound`            | Number of results per page.                                                                                   |
| `count`                      | Number of results per page.                                                                                   |
| `additionalSearchParameters` | Additional search parameters not covered by other parameters.                                                |


# update operation

The `update` operation is used to update resources in the Epic system.

## Properties

| Property Name        | Property Description                                                                                                   |
|----------------------|-------------------------------------------------------------------------------------------------------------------------|
| `type`               | The type of the resource.                                                                                               |
| `id`                 | The id of the resource.                                                                                                |
| `versionId`          | The version-specific identifier of the resource. This value changes when the resource is updated, patched, or deleted. |
| `enableUrlRewrite`   | Whether to enable/disable URL rewrite in the response payload.                                                         |
| `baseUrl`            | Optional base URL to be replaced in the response.                                                                      |
| `serverUrl`          | Public server URL for URL rewrite.                                                                                     |
