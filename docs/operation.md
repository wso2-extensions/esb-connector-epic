# Working with Epic Connector
[[  Overview ]](#overview)  [[ Operation details ]](#operation-details)  [[  Sample configuration  ]](#sample-configuration)

### Overview
The following operations allow you to work with buckets in Epic. Click an operation name to see details on how to use it.
For a sample proxy service that illustrates how to work with buckets, see [Sample configuration](#sample-configuration).

| Operation        | Description |
| ------------- |-------------|
| [readById](#retrieve-a-specific-resource-by-id)| Retrieve a specific resource by its Id. |
| [searchAllergyIntolerance](#search-allergy-intolerance)| Search clinical information about a patient's allergic response to a substance. |
| [searchCarePlan](#search-care-plan)| Search the plan of treatment for a patient. |
| [searchCondition](#search-condition)| Search conditional state of the patient. |
| [searchDevice](#search-device)| Search medical deivces implanted in a patient. |
| [searchDiagnosticReport](#search-diagnostic-report)| Search information about a single diagnostic service performed for a patient. |
| [searchDocumentReference](#search-document-reference)| Search information about a document. |
| [searchFamilyMemberHistory](#search-family-member-history)| Search a patient's family history. |
| [searchGoal](#search-goal)| Search objectives for a patient based on a current condition. |
| [searchImmunization](#search-immunization)| Search information about a patient's immunizations. |
| [searchMedicationOrder](#search-medication-order)| Search information about a medication that was ordered for a patient. |
| [searchMedicationStatement](#search-medication-statement)| Search information about medications being consumed by a patient. |
| [searchObservation](#search-observation)| Search  information about a measurement or simple assertion made about a patient.  |
| [searchPatient](#search-patient)| Search Patient using the given parameters. |
| [searchProcedure](#search-procedure)| Search information about a measurement or simple assertion made about a patient |


## Operation details
This section provides details on each of the operations.

## Retrieve a Specific Resource by Id
This readById operation reads a resource based on the Id you provide.

**ReadById**
```xml
<Epic.readById>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
</Epic.readById>
```
**Properties**
* base: The service root URL.
* type: The type of the resource that is needed to be retrieved.
* id: The logical Id of the resource.

**Sample request**

Following is a sample REST request that can be handled by the readById operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Binary",
 "id": "TYqNBNqjwBO6mCw-0GNyScM5-Cx98sUwSgDyEUEWNlB55kA1n68TTxXsvJJka2DAOHnyzUkZ9uW3UfBJjH4orKAB"
}
```
>Note: the readById operation can be used to read [practitioner](https://open.epic.com/Clinical/Patient) resource as well as [Medication](https://open.epic.com/Clinical/Medication) resource.

**Sample response**
```json
{
    "resourceType": "Binary",
    "id": "TYqNBNqjwBO6mCw-0GNyScM5-Cx98sUwSgDyEUEWNlB55kA1n68TTxXsvJJka2DAOHnyzUkZ9uW3UfBJjH4orKAB",
    "contentType": "application/xml",
    "content": "Binary content"
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Document](https://open.epic.com/Clinical/Document)

## Search Allergy Intolerance
The searchAllergyIntolerance operation provide the user with clinical information about a patient's allergic response to a substance.
This will include the substance which caused the allergy, the type of reaction and the severity.

**searchAllergyIntolerance**
```xml
<Epic.searchAllergyIntolerance>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
    <onset>{$ctx:onset}</onset>
</Epic.searchAllergyIntolerance>
```
**Properties**
* base: The service root URL
* type: The type of the resource (AllergyIntolerance).
* id: The logical Id of the resource.
* patient: Patient id of the person who is subjected to Allergy reaction.
* onset: Date in which the allergy first affected the patient.

**Sample request**

Following is a sample REST request that can be handled by the searchAllergyIntolerance operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “AllergyIntolerance",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "onset": "2012-11-07T00:00:00Z"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/AllergyIntolerance?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&onset=2012-11-07T00:00:00Z"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/AllergyIntolerance/TBwnNbrAqC0Qw5Ha7AFT-2AB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/AllergyIntolerance/TBwnNbrAqC0Qw5Ha7AFT-2AB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "AllergyIntolerance",
        "recordedDate": "2015-08-24T23:11:36Z",
        "status": "confirmed",
        "criticality": "CRITL",
        "id": "TBwnNbrAqC0Qw5Ha7AFT-2AB",
        "onset": "2012-11-07T00:00:00Z",
        "recorder": {
          "display": "MOORE, SEAN",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/TItWfhjChtlo0pFh9nzctSQB"
        },
        "patient": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "substance": {
          "text": "PENICILLIN G",
          "coding": [
            {
              "system": "http://www.nlm.nih.gov/research/umls/rxnorm",
              "code": "7980",
              "display": "PENICILLIN G"
            },
            {
              "system": "http://fdasis.nlm.nih.gov",
              "code": "Q42T66VG0C",
              "display": "PENICILLIN G"
            }
          ]
        },
        "reaction": [
          {
            "certainty": "confirmed",
            "onset": "2012-11-07T00:00:00Z",
            "manifestation": [
              {
                "text": "Hives"
              }
            ],
            "note": {
              "text": "Severity low enough to be prescribed if needed."
            }
          }
        ],
        "note": {
          "text": "Severity low enough to be prescribed if needed."
        }
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Allergy](https://open.epic.com/Clinical/Allergy)

## Search Care Plan
The searchCarePlan operation provides a summarized treatment plan for a patient.This may include links for Goal resource, Condition resource.
Also this will contain information about appointment , referrals and orders.

**searchCarePlan**
```xml
<Epic.searchCarePlan>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <patient>{$ctx:patient}</patient>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
    <category>{$ctx:category}</category>
</Epic.searchCarePlan>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (CarePlan).
* id: The logical Id of the resource.
* patient: who the care plan is for.
* category: category or category types separated by comma Eg:38717003,734163000
* startDate: start date of the care plan.
* endDate: endDate of the care plan.

**Sample request**

Following is a sample REST request that can be handled by the searchCarePlan operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “CarePlan",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "category": "38717003"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/CarePlan?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&category=38717003"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/CarePlan/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/CarePlan/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "CarePlan",
        "id": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
        "status": "active",
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "addresses": [
          {
            "display": "Agoraphobia",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/T1kK.xqvU20cEJe860G4aKgB"
          },
          {
            "display": "Chronic cough",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/ToXGIl7BNrvoF6BVybVSoawB"
          },
          {
            "display": "Asthma",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/T14QqO8NyASby4jGtzuSA6gB"
          },
          {
            "display": "Hemoglobin A1c above reference range",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/TOVSAAQTrMr9e45nCzc8S5wB"
          },
          {
            "display": "TB (pulmonary tuberculosis)",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/TajPohVuPYfDdU-wGcm.KMgB"
          },
          {
            "display": "Zika virus disease",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/T-HzNQh62IyOLOuPFOaTtDgB"
          }
        ],
        "goal": [
          {
            "display": "Hemoglobin A1c < 7.0",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Goal/T20lh4qYCPP9sg31ZDfMLcwB"
          },
          {
            "display": "Reduce the need for your rescue inhaler to less than once each month",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Goal/TbtW9qZPjDclmbmGLLcZkRAB"
          }
        ],
        "activity": [
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "other",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "other",
                    "display": "Other"
                  }
                ]
              },
              "code": {
                "text": "CT abdomen with contrast"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "CBC AND DIFFERENTIAL"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "CBC WITH AUTO DIFFERENTIAL"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "TYPE AND SCREEN"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "COMPREHENSIVE METABOLIC PANEL"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "CBC"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "HEMOGLOBIN A1C"
              }
            }
          },
          {
            "detail": {
              "prohibited": false,
              "category": {
                "text": "procedure",
                "coding": [
                  {
                    "system": "http://hl7.org/fhir/care-plan-activity-category",
                    "code": "procedure",
                    "display": "Procedure"
                  }
                ]
              },
              "code": {
                "text": "LUMBAR PUNCTURE"
              }
            }
          }
        ],
        "category": [
          {
            "text": "Longitudinal",
            "coding": [
              {
                "system": "http://snomed.info/sct",
                "code": "38717003",
                "display": "Longitudinal"
              }
            ]
          }
        ]
      }
    },
    {
      "search": {
        "mode": "outcome"
      },
      "resource": {
        "resourceType": "OperationOutcome",
        "id": "2438047",
        "issue": [
          {
            "severity": "warning",
            "location": [
              "http.category"
            ],
            "code": "informational",
            "details": {
              "text": "An unknown query parameter was supplied by the client.",
              "coding": [
                {
                  "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.657369",
                  "code": "4122",
                  "display": "An unknown query parameter was supplied by the client."
                }
              ]
            }
          }
        ]
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/CarePlan](https://open.epic.com/Clinical/CarePlan)

## Search Condition
The searchCondition Operation provides details about the condition of a patient.

**searchCondition**
```xml
<Epic.searchCondition>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
    <category>{$ctx:category}</category>
    <clinicalStatus>{$ctx:clinicalStatus}</clinicalStatus>
    <startOnset>{$ctx:startOnset}</startOnset>
    <endOnset>{$ctx:endOnset}</endOnset>
</Epic.searchCondition>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Condition).
* id: The logical Id of the resource.
* patient: The Id of the patient who has the condition.
* category: The type of the condition associated with the patient.
* clinicalStatus: State of the condition Eg: confirmed, resolved.
* startOnset: start Date from the date-range when the condition was first affected the patient.
* endOnset: end Date from the date-range when the condition was first affected the patient.

**Sample request**

Following is a sample REST request that can be handled by the searchCondition operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Condition",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "category": "diagnosis",
 "clinicalStatus": "active"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&category=diagnosis&clinicalStatus=active"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/T1kK.xqvU20cEJe860G4aKgB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/T1kK.xqvU20cEJe860G4aKgB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Condition",
        "dateRecorded": "2015-08-24",
        "clinicalStatus": "active",
        "onsetDateTime": "2015-08-24",
        "verificationStatus": "confirmed",
        "id": "T1kK.xqvU20cEJe860G4aKgB",
        "patient": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "asserter": {
          "display": "MOORE, SEAN",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/TItWfhjChtlo0pFh9nzctSQB"
        },
        "code": {
          "text": "Agoraphobia",
          "coding": [
            {
              "system": "urn:oid:2.16.840.1.113883.6.90",
              "code": "F40.00",
              "display": "Agoraphobia"
            },
            {
              "system": "http://snomed.info/sct",
              "code": "70691001",
              "display": "Agoraphobia (disorder)"
            }
          ]
        },
        "category": {
          "text": "Diagnosis",
          "coding": [
            {
              "system": "http://loinc.org",
              "code": "29308-4",
              "display": "Diagnosis"
            },
            {
              "system": "http://snomed.info/sct",
              "code": "439401001",
              "display": "Diagnosis"
            },
            {
              "system": "http://hl7.org/fhir/condition-category",
              "code": "diagnosis",
              "display": "Diagnosis"
            },
            {
              "system": "http://argonautwiki.hl7.org/extension-codes",
              "code": "problem",
              "display": "Problem"
            }
          ]
        },
        "severity": {
          "text": "Medium"
        }
      }
    }
   ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Condition](https://open.epic.com/Clinical/Condition)

## Search Device
The searchDevice operation provides details about implanted device in a patient.

**searchDevice**
```xml
<Epic.searchDevice>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <deviceType>{$ctx:deviceType}</deviceType>
    <patient>{$ctx:patient}</patient>
    <udi>{$ctx:udi}</udi>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
</Epic.searchDevice>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Device).
* id: The logical Id of the resource.
* deviceType: Type of the device implanted.
* patient: Id of the patient with the implanted device.
* udi: Device's FDA-mandated Universal Device Identifier.
* startDate: start date from the date-range in which the implanted record was last updated.
* endDate: end date from the date-range in which the implanted record was last updated.

**Sample request**

Following is a sample REST request that can be handled by the searchDevice operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Device",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "udi": "(17)170324(21)455884315749"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Device?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&udi=(17)170324(21)455884315749"
    }
  ],
  "entry": [
    {
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Device/TCqziYTxuM-ZyuEVLm2vyvgB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Device",
        "udi": "(17)170324(21)455884315749",
        "model": "G754-B",
        "expiry": "2017-03-24T00:00:00Z",
        "id": "TCqziYTxuM-ZyuEVLm2vyvgB",
        "status": "available",
        "patient": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "type": {
          "text": "Pacemaker",
          "coding": [
            {
              "system": "urn:oid:1.2.840.114350.1.13.0.1.7.10.737780.70",
              "code": "110",
              "display": "Pacemaker"
            }
          ]
        }
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Device](https://open.epic.com/Clinical/Device)

## Search Diagnostic Report
The searchDiagnosticReport operation provides diagnostic service performed for a patient.

**searchDiagnosticReport**
```xml
<Epic.searchDiagnosticReport>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <patient>{$ctx:patient}</patient>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
</Epic.searchDiagnosticReport>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (DiagnosticReport).
* id: The logical Id of the resource.
* patient: The patient Id whose Diagnostic report to.
* startDate: start date of the diagnostic report.
* endDate: end date of the diagnostic report.

**Sample request**

Following is a sample REST request that can be handled by the searchDiagnosticReport operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “DiagnosticReport",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "startDate": "2016-02-01",
 "endDate": "2016-03-01"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/DiagnosticReport?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&date=gt2016-02-01&date=lt2016-03-01"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/DiagnosticReport/TcBUxystqz3GaFH9DJMbHIAB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/DiagnosticReport/TcBUxystqz3GaFH9DJMbHIAB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "DiagnosticReport",
        "status": "registered",
        "effectiveDateTime": "2016-02-06T18:00:00Z",
        "issued": "2016-02-08T19:12:00Z",
        "id": "TcBUxystqz3GaFH9DJMbHIAB",
        "identifier": [
          {
            "use": "official",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
            "value": "981967",
            "type": {
              "text": "Placer Identifier",
              "coding": [
                {
                  "system": "http://hl7.org/fhir/ValueSet/identifier-type",
                  "code": "PLAC",
                  "display": "Placer Identifier"
                }
              ]
            }
          }
        ],
        "code": {
          "text": "CBC WITH AUTO DIFFERENTIAL"
        },
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "performer": {
          "display": "Physician Family Medicine",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/T3Mz3KLBDVXXgaRoee3EKAAB"
        },
        "result": [
          {
            "display": "Component: LEUKOCYTES [10*3/ML] CORRECTED FOR NUCLEATED ERYTHROCYTES IN BLOOD",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.okW4lQgqPzu7V1lBvE17joB"
          },
          {
            "display": "Component: ERYTHROCYTES [10*6/UL] IN BLOOD BY AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.mPFnpMedsr1YJfBlc7qDlgB"
          },
          {
            "display": "Component: HEMATOCRIT (%) BY AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.taYT0aP8tpA6EMqwysMD-YB"
          },
          {
            "display": "Component: ERYTHROCYTE MEAN CORPUSCULAR HEMOGLOBIN [PG] BY AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.rCJF0vit80lYaUKjdV9PIkB"
          },
          {
            "display": "Component: ERYTHROCYTE MEAN CORPUSCULAR HEMOGLOBIN CONCENTRATION [G/DL] BY AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.qYI7D5DXBSs75JZ.E-Zp4EB"
          },
          {
            "display": "Component: ERYTHROCYTE DISTRIBUTION WIDTH [RATIO] BY AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.kFFQctsJuhWvwoAjUJDRpcB"
          },
          {
            "display": "Component: PLATELETS [10*3/UL] IN BLOOD AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.ieu-B9RmRSXTVvHdzncHg8B"
          },
          {
            "display": "Component: PLATELET MEAN VOLUME [FL] IN BLOOD BY AUTOMATED COUNT",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Ta2SF7QbUwYc48UV97Nkr.nw89.qY6NrmzFt.zIJ47hUB"
          }
        ]
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Report](https://open.epic.com/Clinical/Report)

## Search Document reference
The searchDocumentReference operation provides information about about a document.This includes data about associated patient,author and about its creation.
This resource only provides meta-data about the document.

**searchDocumentReference**
```xml
<Epic.searchDocumentReference>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <patient>{$ctx:patient}</patient>
    <class>{$ctx:class}</class>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
</Epic.searchDocumentReference>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (DocumentReference).
* id: The logical Id of the resource.
* patient: The patient Id of the person that the document belongs to.
* startDate: start date of the document reference.
* endDate: end date of the document reference.
* class: document reference class.

**Sample request**

Following is a sample REST request that can be handled by the searchDocumentReference operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “DocumentReference",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "startDate": "2016-01-26",
 "endDate": "2016-01-26"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/DocumentReference?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&created=ge2016-01-26&created=lt2016-01-26"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/DocumentReference/T51iWjMg3MhfQWNRaJpmEF8ALTC6lQcunX-VTNpxqyTiV8.6oSleCNUa5Yr82YE4CJaCO0rcZankXUhpoCWkzlwB",
      "search": {
        "mode": "match"
      },
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/DocumentReference/T51iWjMg3MhfQWNRaJpmEF8ALTC6lQcunX-VTNpxqyTiV8.6oSleCNUa5Yr82YE4CJaCO0rcZankXUhpoCWkzlwB"
        }
      ],
      "resource": {
        "resourceType": "DocumentReference",
        "created": "2016-10-18T00:00:00Z",
        "indexed": "2016-10-18T00:00:00Z",
        "status": "current",
        "id": "T51iWjMg3MhfQWNRaJpmEF8ALTC6lQcunX-VTNpxqyTiV8.6oSleCNUa5Yr82YE4CJaCO0rcZankXUhpoCWkzlwB",
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "class": {
          "text": "Summarization of Episode Note",
          "coding": [
            {
              "system": "http://loinc.org",
              "code": "34133-9",
              "display": "Summarization of Episode Note"
            }
          ]
        },
        "type": {
          "text": "Summarization of Episode Note",
          "coding": [
            {
              "system": "http://loinc.org",
              "code": "34133-9",
              "display": "Summarization of Episode Note"
            }
          ]
        },
        "content": [
          {
            "attachment": {
              "contentType": "application/xml",
              "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Binary/T51iWjMg3MhfQWNRaJpmEF8ALTC6lQcunX-VTNpxqyTiV8.6oSleCNUa5Yr82YE4CJaCO0rcZankXUhpoCWkzlwB"
            }
          }
        ],
        "masterIdentifier": {
          "value": "1.2.840.114350.1.13.0.1.7.8.688883.11147"
        }
      }
    },
    {
      "search": {
        "mode": "outcome"
      },
      "resource": {
        "resourceType": "OperationOutcome",
        "id": "2438196",
        "issue": [
          {
            "severity": "warning",
            "location": [
              "http.created"
            ],
            "code": "informational",
            "details": {
              "text": "An unknown query parameter was supplied by the client.",
              "coding": [
                {
                  "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.657369",
                  "code": "4122",
                  "display": "An unknown query parameter was supplied by the client."
                }
              ]
            }
          },
          {
            "severity": "warning",
            "location": [
              "http.created"
            ],
            "code": "informational",
            "details": {
              "text": "An unknown query parameter was supplied by the client.",
              "coding": [
                {
                  "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.657369",
                  "code": "4122",
                  "display": "An unknown query parameter was supplied by the client."
                }
              ]
            }
          }
        ]
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Document](https://open.epic.com/Clinical/Document)

## Search Family member history
The searchFamilyHistory resource provides patient's family history. This resource returns the current status, age, and medical and surgical history of relatives related to a specific patient. 

**searchFamilyMemberHistory**
```xml
<Epic.searchFamilyMemberHistory>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
</Epic.searchFamilyMemberHistory>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (FamilyMemberHistory).
* patient: The patient Id of the person who needs to search the family history for.

**Sample request**

Following is a sample REST request that can be handled by the searchFamilyMemberHistory operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “FamilyMemberHistory",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 3,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/FamilyMemberHistory?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
    }
  ],
  "entry": [
    {
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "FamilyMemberHistory",
        "date": "2015-08-27",
        "name": "Hera",
        "deceasedBoolean": false,
        "status": "partial",
        "patient": {
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
          "display": "Jason Argonaut"
        },
        "relationship": {
          "text": "Mother",
          "coding": [
            {
              "system": "http://hl7.org/fhir/ValueSet/v3-FamilyMember",
              "code": "MTH",
              "display": "Mother"
            }
          ]
        },
        "condition": [
          {
            "code": {
              "text": "Abnormal EKG"
            }
          }
        ]
      }
    },
    {
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "FamilyMemberHistory",
        "date": "2015-08-27",
        "name": "Zeus",
        "deceasedBoolean": false,
        "status": "partial",
        "patient": {
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
          "display": "Jason Argonaut"
        },
        "relationship": {
          "text": "Father",
          "coding": [
            {
              "system": "http://hl7.org/fhir/ValueSet/v3-FamilyMember",
              "code": "FTH",
              "display": "Father"
            }
          ]
        },
        "condition": [
          {
            "code": {
              "text": "Allergy (severe)"
            },
            "note": {
              "text": "Allergic to Golden Fleece"
            }
          }
        ]
      }
    },
    {
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "FamilyMemberHistory",
        "date": "2015-08-27",
        "name": "Athena",
        "deceasedBoolean": false,
        "status": "partial",
        "patient": {
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
          "display": "Jason Argonaut"
        },
        "relationship": {
          "text": "Sister",
          "coding": [
            {
              "system": "http://hl7.org/fhir/ValueSet/v3-FamilyMember",
              "code": "SIS",
              "display": "Sister"
            }
          ]
        }
      }
    }
  ]
} 
```
**Related epic documentation**
[https://open.epic.com/Clinical/FamHx](https://open.epic.com/Clinical/FamHx)

## Search Goal
The search Goal operation provides information about the defined objectives for a patient based on a current condition or recent procedure.

**searchGoal**
```xml
<Epic.searchGoal>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
    <category>{$ctx:category}</category>
    <status>{$ctx:status}</status>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
</Epic.searchGoal>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Goal).
* patient: The patient Id of the person who the goal is about.
* category: The category to which the goal belongs to.
* status: The status of the goal.Eg: in-progress, achieved, or cancelled.
* startDate: start date from the date-range when a particular goal was last updated.
* endDate: end date from the date-range when a particular goal was last updated.

**Sample request**

Following is a sample REST request that can be handled by the searchGoal operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Goal",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "status": "in-progress"
}
```

**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Goal?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Goal/T20lh4qYCPP9sg31ZDfMLcwB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Goal/T20lh4qYCPP9sg31ZDfMLcwB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Goal",
        "startDate": "2016-03-26",
        "description": "Hemoglobin A1c < 7.0",
        "status": "in-progress",
        "id": "T20lh4qYCPP9sg31ZDfMLcwB",
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "category": [
          {
            "text": "Result Component",
            "coding": [
              {
                "system": "urn:oid:1.2.840.114350.1.13.0.1.7.4.737184.20005",
                "code": "5",
                "display": "Result Component"
              }
            ]
          }
        ],
        "author": {
          "display": "MOORE, SEAN",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/TItWfhjChtlo0pFh9nzctSQB"
        },
        "addresses": [
          {
            "display": "Hemoglobin A1c Above Reference Range",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Condition/TOVSAAQTrMr9e45nCzc8S5wB"
          }
        ],
        "note": [
          {
            "text": "Regularly monitor A1C levels toward overall goal of 6.0."
          }
        ]
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/CarePlan](https://open.epic.com/Clinical/CarePlan)

## Search Immunization
The search Immunization operation provide information about a patient's immunizations.

**searchImmunization**
```xml
<Epic.searchImmunization>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
    <id>{$ctx:id}</id>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
</Epic.searchImmunization>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Immunization).
* patient: Id of the patient who is subjected for the vaccination.
* id: The logical Id of the resource.
* startDate: start date from the date-range when the immunization was administered or last documented.
* endDate: end date from the date-range when the immunization was administered or last documented.

**Sample request**

Following is a sample REST request that can be handled by the searchImmunization operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Immunization",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "startDate": "2016-03-01"
}
```

**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Immunization?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&date=gt2016-03-01"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Immunization/TfHwRVsICbE33tGGsW1GWvgB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Immunization/TfHwRVsICbE33tGGsW1GWvgB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Immunization",
        "status": "completed",
        "date": "2016-03-02T00:00:00Z",
        "wasNotGiven": false,
        "reported": true,
        "id": "TfHwRVsICbE33tGGsW1GWvgB",
        "vaccineCode": {
          "text": "Cholera",
          "coding": [
            {
              "system": "http://hl7.org/fhir/sid/cvx",
              "code": "26",
              "display": "CHOLERA"
            }
          ]
        },
        "patient": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "site": {
          "text": "Left arm",
          "coding": [
            {
              "system": "urn:oid:1.2.840.114350.1.13.0.1.7.10.768076.4040",
              "code": "14",
              "display": "Left arm"
            }
          ]
        },
        "route": {
          "text": "Intravenous",
          "coding": [
            {
              "system": "urn:oid:1.2.840.114350.1.13.0.1.7.10.768076.4030",
              "code": "6",
              "display": "Intravenous"
            }
          ]
        }
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Immunization](https://open.epic.com/Clinical/Immunization)

## Search Medication Order
The search Medication order operation provide information about a medication that was ordered for a patient.This includes prescriptions or OTC drugs ordered in an ambulatory clinic and also 
medication that should be taken by or given to the patient.

**searchMedicationOrder**
```xml
<Epic.searchMedicationOrder>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
    <id>{$ctx:id}</id>
    <status>{$ctx:status}</status>
    <dateWritten>{$ctx:dateWritten}</dateWritten>
</Epic.searchMedicationOrder>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (MedicationOrder).
* patient: Id of the patient whose medication order belongs to.
* id: The logical Id of the resource.
* status: The status of the medication order.
* dateWritten: The date in which the medication was  ordered.

**Sample request**

Following is a sample REST request that can be handled by the searchMedicationOrder operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “MedicationOrder",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "status": "active,completed",
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 1,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/MedicationOrder?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&status=active,completed"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/MedicationOrder/TG49lm2wVQlU58.ppXAAYnQB",
      "search": {
        "mode": "match"
      },
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/MedicationOrder/TG49lm2wVQlU58.ppXAAYnQB"
        }
      ],
      "resource": {
        "resourceType": "MedicationOrder",
        "dateWritten": "2015-08-24",
        "status": "completed",
        "id": "TG49lm2wVQlU58.ppXAAYnQB",
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
            "value": "971097"
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.3.798268.801",
            "value": "971097:0412944669"
          }
        ],
        "patient": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "prescriber": {
          "display": "Physician Family Medicine",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/T3Mz3KLBDVXXgaRoee3EKAAB"
        },
        "medicationReference": {
          "display": "acetaminophen (TYLENOL 8 HOUR) 650 MG 8 hr tablet",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Medication/TvoALIQGLNsjQ3HzzxmSWLwB"
        },
        "dosageInstruction": [
          {
            "text": "Take 1 tablet (650 mg total) by mouth every 8 (eight) hours as needed for mild pain for up to 10 days.",
            "asNeededBoolean": true,
            "route": {
              "text": "Oral",
              "coding": [
                {
                  "system": "urn:oid:1.2.840.114350.1.13.0.1.7.4.698288.330",
                  "code": "15",
                  "display": "Oral"
                }
              ]
            },
            "method": {
              "text": "Take",
              "coding": [
                {
                  "system": "urn:oid:1.2.840.114350.1.13.0.1.7.4.798268.8600",
                  "code": "11",
                  "display": "Take"
                }
              ]
            },
            "timing": {
              "repeat": {
                "frequency": 1,
                "period": 8,
                "periodUnits": "h",
                "boundsPeriod": {
                  "start": "2015-08-24T00:00:00Z",
                  "end": "2015-09-03T00:00:00Z"
                }
              }
            },
            "doseQuantity": {
              "value": 1,
              "unit": "tablet"
            }
          }
        ],
        "dispenseRequest": {
          "numberOfRepeatsAllowed": 0,
          "expectedSupplyDuration": {
            "value": 10,
            "unit": "days",
            "code": "d",
            "system": "urn:oid:2.16.840.1.113883.6.8"
          },
          "quantity": {
            "value": 30,
            "unit": "tablet"
          },
          "validityPeriod": {
            "start": "2015-08-24T00:00:00Z",
            "end": "2015-09-03T00:00:00Z"
          }
        }
      }
    }
   ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Medication](https://open.epic.com/Clinical/Medication)

## Search Medication Statement
The search Medication Statement operation provides information about medications being consumed by a patient. This includes prescriptions, OTC drugs ordered in an ambulatory clinic, and medications reported by a patient.

**searchMedicationStatement**
```xml
<Epic.searchMedicationStatement>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <patient>{$ctx:patient}</patient>
    <status>{$ctx:status}</status>
    <startEffectiveDate>{$ctx:startEffectiveDate}</startEffectiveDate>
    <endEffectiveDate>{$ctx:endEffectiveDate}</endEffectiveDate>
</Epic.searchMedicationStatement>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (MedicationStatement).
* patient: Id of the patient whose medication statement is about.
* id: The logical Id of the resource.
* status: The status of the medication statement.Eg: active,completed.
* startEffectiveDate: start date from the date-range of the Medication was ordered.
* endEffectiveDate: end date from the date-range of the Medication was ordered.

**Sample request**

Following is a sample REST request that can be handled by the searchMedicationStatement operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “MedicationStatement",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "status": "active,completed",
}
```
**Sample response**
```json
{
    "resourceType": "Bundle",
    "type": "searchset",
    "total": 1,
    "link": [
        {
            "relation": "self",
            "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/MedicationStatement?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&status=active,completed"
        }
    ],
    "entry": [
        {
            "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/MedicationStatement/TEYRqlko22AB6J.Fi4MCvpwB",
            "link": [
                {
                    "relation": "self",
                    "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/MedicationStatement/TEYRqlko22AB6J.Fi4MCvpwB"
                }
            ],
            "search": {
                "mode": "match"
            },
            "resource": {
                "resourceType": "MedicationStatement",
                "status": "completed",
                "id": "TEYRqlko22AB6J.Fi4MCvpwB",
                "identifier": [
                    {
                        "use": "usual",
                        "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
                        "value": "971096"
                    },
                    {
                        "use": "usual",
                        "system": "urn:oid:1.2.840.114350.1.13.0.1.7.3.798268.801",
                        "value": "971096:0396167050"
                    }
                ],
                "patient": {
                    "display": "Jason Argonaut",
                    "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
                },
                "informationSource": {
                    "display": "Physician Family Medicine",
                    "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/T3Mz3KLBDVXXgaRoee3EKAAB"
                },
                "effectivePeriod": {
                    "start": "2015-08-24T00:00:00Z",
                    "end": "2015-09-03T00:00:00Z"
                },
                "medicationCodeableConcept": {
                    "text": "amoxicillin (AMOXIL) 500 MG capsule",
                    "coding": [
                        {
                            "system": "http://www.nlm.nih.gov/research/umls/rxnorm",
                            "code": "308191",
                            "display": "amoxicillin (AMOXIL) 500 MG capsule"
                        }
                    ]
                },
                "dosage": [
                    {
                        "text": "Take 1 capsule (500 mg total) by mouth 3 (three) times a day for 10 days.",
                        "asNeededBoolean": false,
                        "timing": {
                            "repeat": {
                                "frequency": 1,
                                "period": 8,
                                "periodUnits": "h",
                                "boundsPeriod": {
                                    "start": "2015-08-24T00:00:00Z",
                                    "end": "2015-09-03T00:00:00Z"
                                }
                            }
                        },
                        "route": {
                            "text": "Oral",
                            "coding": [
                                {
                                    "system": "urn:oid:1.2.840.114350.1.13.0.1.7.4.698288.330",
                                    "code": "15",
                                    "display": "Oral"
                                }
                            ]
                        },
                        "method": {
                            "text": "Take",
                            "coding": [
                                {
                                    "system": "urn:oid:1.2.840.114350.1.13.0.1.7.4.798268.8600",
                                    "code": "11",
                                    "display": "Take"
                                }
                            ]
                        },
                        "quantityQuantity": {
                            "value": 1,
                            "unit": "capsule"
                        }
                    }
                ]
            }
        }
    ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Medication](https://open.epic.com/Clinical/Medication)

## Search Observation
The searchObservation operation provides information about measurements or simple assertion made about a patient.
**searchObservation**
```xml
<Epic.searchObservation>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <patient>{$ctx:patient}</patient>
    <code>{$ctx:code}</code>
    <category>{$ctx:category}</category>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
    <startIssued>{$ctx:startIssued}</startIssued>
    <endIssued>{$ctx:endIssued}</endIssued>
</Epic.searchObservation>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Observation).
* patient: Id of the patient whose observation is about.
* id: The logical Id of the resource.
* code: The Code Id which represents the specific observation user is searching for.
* category: The category of the observation.Eg:vital-signs, social-history.
* startDate: start date from the date-range in which the observation was first recorded.
* endDate: end date from the date-range in which the observation was resulted or recorded.
* startIssued: start date from the date-range in which the smoking history observation was first recorded.
* endIssued: end date from the date-range in which the smoking history observation was recorded.

**Sample request**

Following is a sample REST request that can be handled by the searchObservation operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Observation",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "code": "718-7",
 "endDate": "20160101"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 2,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&code=718-7&date=lt20160101"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/TDsM-v6omSaRsvT.-NvxIwEKnfOsXOrOtzmcRysvbQ6cB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/TDsM-v6omSaRsvT.-NvxIwEKnfOsXOrOtzmcRysvbQ6cB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Observation",
        "effectiveDateTime": "2015-10-03T20:21:00Z",
        "issued": "2015-10-03T20:21:00Z",
        "status": "final",
        "id": "TDsM-v6omSaRsvT.-NvxIwEKnfOsXOrOtzmcRysvbQ6cB",
        "code": {
          "text": "HEMOGLOBIN [G/DL] IN BLOOD",
          "coding": [
            {
              "system": "http://loinc.org",
              "code": "718-7",
              "display": "Hemoglobin [Mass/volume] in Blood"
            }
          ]
        },
        "valueQuantity": {
          "value": 13,
          "unit": "g/dL",
          "code": "g/dL",
          "system": "http://unitsofmeasure.org"
        },
        "interpretation": {
          "text": "Low",
          "coding": [
            {
              "system": "http://hl7.org/fhir/ValueSet/observation-interpretation",
              "code": "L",
              "display": "Low"
            }
          ]
        },
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "referenceRange": [
          {
            "text": "13.5 - 17.5 g/dL",
            "low": {
              "value": 13.5,
              "unit": "g/dL",
              "code": "g/dL",
              "system": "http://unitsofmeasure.org"
            },
            "high": {
              "value": 17.5,
              "unit": "g/dL",
              "code": "g/dL",
              "system": "http://unitsofmeasure.org"
            }
          }
        ],
        "category": {
          "text": "Laboratory",
          "coding": [
            {
              "system": "http://hl7.org/fhir/observation-category",
              "code": "laboratory",
              "display": "Laboratory"
            }
          ]
        }
      }
    },
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Te4K6zjiXtD2Z7Fdc.AXXOJEMbKy.y6IjKIGTLxjw96oB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Observation/Te4K6zjiXtD2Z7Fdc.AXXOJEMbKy.y6IjKIGTLxjw96oB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Observation",
        "effectiveDateTime": "2015-10-03T20:20:00Z",
        "issued": "2015-10-03T20:20:00Z",
        "status": "preliminary",
        "id": "Te4K6zjiXtD2Z7Fdc.AXXOJEMbKy.y6IjKIGTLxjw96oB",
        "code": {
          "text": "HEMOGLOBIN [G/DL] IN BLOOD",
          "coding": [
            {
              "system": "http://loinc.org",
              "code": "718-7",
              "display": "Hemoglobin [Mass/volume] in Blood"
            }
          ]
        },
        "valueQuantity": {
          "value": 16,
          "unit": "g/dL",
          "code": "g/dL",
          "system": "http://unitsofmeasure.org"
        },
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "referenceRange": [
          {
            "text": "13.5 - 17.5 g/dL",
            "low": {
              "value": 13.5,
              "unit": "g/dL",
              "code": "g/dL",
              "system": "http://unitsofmeasure.org"
            },
            "high": {
              "value": 17.5,
              "unit": "g/dL",
              "code": "g/dL",
              "system": "http://unitsofmeasure.org"
            }
          }
        ],
        "category": {
          "text": "Laboratory",
          "coding": [
            {
              "system": "http://hl7.org/fhir/observation-category",
              "code": "laboratory",
              "display": "Laboratory"
            }
          ]
        }
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Observation](https://open.epic.com/Clinical/Observation)

## Search Patient
The searchPatient operation provide information about a patient, which will include demographics, care providers, and other administrative information.

**searchPatient**
```xml
<Epic.searchPatient>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <id>{$ctx:id}</id>
    <identifier>{$ctx:identifier}</identifier>
    <family>{$ctx:family}</family>
    <given>{$ctx:given}</given>
    <birthdate>{$ctx:birthdate}</birthdate>
    <gender>{$ctx:gender}</gender>
    <address>{$ctx:address}</address>
    <telecom>{$ctx:telecom}</telecom>
</Epic.searchPatient>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Patient).
* id: The logical Id of the resource.
* identifier: Business identifier of the patient.
* family: Family name or the last name of the patient.
* given: First name or the given name of the patient.
* birthdate: Date of birth of the patient(YYYY-MM-DD).
* gender: Gender code for the patient. Eg: female, male, other, or unknown.
* address: First line of the patient street address.
* telecom: Patients home or telephone number.

**Sample request**

Following is a sample REST request that can be handled by the searchPatient operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Patient",
 "family": "Argonaut",
 "given": "Jason"
}
```
**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 2,
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Patient",
        "birthDate": "1985-08-01",
        "active": true,
        "gender": "male",
        "deceasedBoolean": false,
        "id": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
        "careProvider": [
          {
            "display": "Physician Family Medicine",
            "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Practitioner/T3Mz3KLBDVXXgaRoee3EKAAB"
          }
        ],
        "name": [
          {
            "use": "usual",
            "text": "Jason Argonaut",
            "family": [
              "Argonaut"
            ],
            "given": [
              "Jason"
            ]
          }
        ],
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.327.1.7.5.737384.0",
            "value": "E3826"
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.3.4",
            "value": "203579"
          }
        ],
        "address": [
          {
            "use": "home",
            "line": [
              "1979 Milky Way Dr."
            ],
            "city": "Verona",
            "state": "WI",
            "postalCode": "53593",
            "country": "US"
          },
          {
            "use": "temp",
            "line": [
              "5301 Tokay Blvd"
            ],
            "city": "MADISON",
            "state": "WI",
            "postalCode": "53711",
            "country": "US",
            "period": {
              "start": "2011-08-04T00:00:00Z",
              "end": "2014-08-04T00:00:00Z"
            }
          }
        ],
        "telecom": [
          {
            "system": "phone",
            "value": "608-271-9000",
            "use": "home"
          },
          {
            "system": "phone",
            "value": "608-771-9000",
            "use": "work"
          },
          {
            "system": "phone",
            "value": "608-771-9000",
            "use": "mobile"
          },
          {
            "system": "fax",
            "value": "608-771-9000",
            "use": "home"
          },
          {
            "system": "phone",
            "value": "608-771-9000",
            "use": "temp",
            "period": {
              "start": "2011-08-04T00:00:00Z",
              "end": "2014-08-04T00:00:00Z"
            }
          },
          {
            "system": "email",
            "value": "open@epic.com"
          }
        ],
        "maritalStatus": {
          "text": "Single",
          "coding": [
            {
              "system": "http://hl7.org/fhir/ValueSet/marital-status",
              "code": "S",
              "display": "Never Married"
            }
          ]
        },
        "communication": [
          {
            "preferred": true,
            "language": {
              "text": "English",
              "coding": [
                {
                  "system": "urn:oid:2.16.840.1.113883.6.99",
                  "code": "en",
                  "display": "English"
                }
              ]
            }
          }
        ],
        "extension": [
          {
            "url": "http://hl7.org/fhir/StructureDefinition/us-core-race",
            "valueCodeableConcept": {
              "text": "Asian",
              "coding": [
                {
                  "system": "2.16.840.1.113883.5.104",
                  "code": "2028-9",
                  "display": "Asian"
                }
              ]
            }
          },
          {
            "url": "http://hl7.org/fhir/StructureDefinition/us-core-ethnicity",
            "valueCodeableConcept": {
              "text": "Not Hispanic or Latino",
              "coding": [
                {
                  "system": "2.16.840.1.113883.5.50",
                  "code": "2186-5",
                  "display": "Not Hispanic or Latino"
                }
              ]
            }
          },
          {
            "url": "http://hl7.org/fhir/StructureDefinition/us-core-birth-sex",
            "valueCodeableConcept": {
              "text": "Male",
              "coding": [
                {
                  "system": "http://hl7.org/fhir/v3/AdministrativeGender",
                  "code": "M",
                  "display": "Male"
                }
              ]
            }
          }
        ]
      }
    },
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Ta1lSLg3glOZyQI.K3L08iF1-Tlb0E3TXC2L2CsyGMScB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Ta1lSLg3glOZyQI.K3L08iF1-Tlb0E3TXC2L2CsyGMScB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Patient",
        "birthDate": "1985-08-01",
        "active": true,
        "gender": "male",
        "deceasedBoolean": false,
        "id": "Ta1lSLg3glOZyQI.K3L08iF1-Tlb0E3TXC2L2CsyGMScB",
        "name": [
          {
            "use": "usual",
            "text": "Jason Argonaut",
            "family": [
              "Argonaut"
            ],
            "given": [
              "Jason"
            ]
          }
        ],
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.327.1.7.5.737384.0",
            "value": "E4648"
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.3.4",
            "value": "203719"
          }
        ],
        "address": [
          {
            "use": "home",
            "line": [
              "1979 Milky Way Dr."
            ],
            "city": "Verona",
            "state": "WI",
            "postalCode": "53593",
            "country": "US"
          }
        ],
        "telecom": [
          {
            "system": "phone",
            "value": "608-271-9000",
            "use": "home"
          },
          {
            "system": "phone",
            "value": "608-771-9000",
            "use": "work"
          },
          {
            "system": "phone",
            "value": "608-771-9000",
            "use": "mobile"
          }
        ],
        "maritalStatus": {
          "text": "Married",
          "coding": [
            {
              "system": "http://hl7.org/fhir/ValueSet/marital-status",
              "code": "M",
              "display": "Married"
            }
          ]
        },
        "communication": [
          {
            "preferred": true,
            "language": {
              "text": "English",
              "coding": [
                {
                  "system": "urn:oid:2.16.840.1.113883.6.99",
                  "code": "en",
                  "display": "English"
                }
              ]
            }
          }
        ],
        "extension": [
          {
            "url": "http://hl7.org/fhir/StructureDefinition/us-core-race",
            "valueCodeableConcept": {
              "text": "Other Race",
              "coding": [
                {
                  "system": "2.16.840.1.113883.5.104",
                  "code": "2131-1",
                  "display": "Other Race"
                }
              ]
            }
          },
          {
            "url": "http://hl7.org/fhir/StructureDefinition/us-core-ethnicity",
            "valueCodeableConcept": {
              "text": "Not Hispanic or Latino",
              "coding": [
                {
                  "system": "2.16.840.1.113883.5.50",
                  "code": "2186-5",
                  "display": "Not Hispanic or Latino"
                }
              ]
            }
          },
          {
            "url": "http://hl7.org/fhir/StructureDefinition/us-core-birth-sex",
            "valueCodeableConcept": {
              "text": "Male",
              "coding": [
                {
                  "system": "http://hl7.org/fhir/v3/AdministrativeGender",
                  "code": "M",
                  "display": "Male"
                }
              ]
            }
          }
        ]
      }
    }
  ],
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient?family=Argonaut&given=Jason"
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Patient](https://open.epic.com/Clinical/Patient)

## Search Procedure
The searchProcedure operation provides information about surgeries, Procedures such as endoscopy and also actions like counseling and physiotherapy.

**searchProcedure**
```xml
<Epic.searchProcedure>
    <base>{$ctx:base}</base>
    <type>{$ctx:type}</type>
    <patient>{$ctx:patient}</patient>
    <id>{$ctx:id}</id>
    <startDate>{$ctx:startDate}</startDate>
    <endDate>{$ctx:endDate}</endDate>
</Epic.searchProcedure>
```
**Properties**
* base: The service root URL.
* type: The type of the resource (Procedure).
* patient: Id of the patient whose Procedure is about.
* id: The logical Id of the resource.
* startDate: The start date from the date-range in which the procedure  was resulted.
* endDate: The end date from the date-range in which the procedure was resulted.

**Sample request**

Following is a sample REST request that can be handled by the searchProcedure operation.
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Procedure",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "startDate": "2015-12-31"
}
```

**Sample response**
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 2,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&date=gt2015-12-31"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/T2ffTCnlLQ-grHJP5yDSZjn5j0NrpKynvAK9vwE7XNDAB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/T2ffTCnlLQ-grHJP5yDSZjn5j0NrpKynvAK9vwE7XNDAB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Procedure",
        "status": "completed",
        "notPerformed": false,
        "performedDateTime": "2016-08-06T13:27:00Z",
        "id": "T2ffTCnlLQ-grHJP5yDSZjn5j0NrpKynvAK9vwE7XNDAB",
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
            "value": "988735",
            "type": {
              "text": "ORD"
            }
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.696580",
            "value": "33882",
            "type": {
              "text": "EAP"
            }
          }
        ],
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "code": {
          "text": "CT ABDOMEN W CONTRAST",
          "coding": [
            {
              "system": "http://www.ama-assn.org/go/cpt",
              "code": "74160",
              "display": "CHG CT SCAN OF ABDOMEN CONTRAST"
            }
          ]
        }
      }
    },
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/TSHhR7qMWAaHUzPGu5ausdAaCXeK.suMTMs1EiqVcX18B",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/TSHhR7qMWAaHUzPGu5ausdAaCXeK.suMTMs1EiqVcX18B"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Procedure",
        "status": "completed",
        "notPerformed": false,
        "performedDateTime": "2016-11-23T18:47:00Z",
        "id": "TSHhR7qMWAaHUzPGu5ausdAaCXeK.suMTMs1EiqVcX18B",
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
            "value": "1001984",
            "type": {
              "text": "ORD"
            }
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.696580",
            "value": "41423",
            "type": {
              "text": "EAP"
            }
          }
        ],
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "code": {
          "text": "REMOVE STAPLES",
          "coding": [
            {
              "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.696580",
              "code": "41423",
              "display": "REMOVE STAPLES"
            }
          ]
        }
      }
    }
  ]
}
```
**Related epic documentation**
[https://open.epic.com/Clinical/Procedure](https://open.epic.com/Clinical/Procedure)

## Sample configuration
Following is a sample proxy service that illustrates how to connect to Epic with the init operation and use the searchObservation operation. 
The sample request for this proxy can be found in searchObservation sample request. You can use this sample as a template for using other operations in this category.

1. Create a sample proxy as below :

```xml
<proxy xmlns="http://ws.apache.org/ns/synapse" name="searchProcedure"
       statistics="disable" trace="disable" transports="https,http" startOnLoad="true">
    <target>
        <inSequence>
            <property name="base" expression="json-eval($.base)"/>
            <property name="type" expression="json-eval($.type)"/>
            <property name="patient" expression="json-eval($.patient)"/>
            <property name="startDate" expression="json-eval($.startDate)"/>
            <Epic.init>
                <base>{$ctx:base}</base>
            </Epic.init>
            <Epic.searchProcedure>
                <type>{$ctx:type}</type>
                <patient>{$ctx:patient}</patient>
                <startDate>{$ctx:startDate}</startDate>
            </Epic.searchProcedure>
            <log category="INFO" level="full" separator=","/>
            <send/>
        </inSequence>
        <outSequence/>
        <faultSequence/>
    </target>
    <parameter name="serviceType">proxy</parameter>
    <description/>
</proxy>
```
2. Create a json file called searchProcedure.json containing the following json:
```
{
 "base": “https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/",
 "type": “Procedure",
 "patient": "Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB",
 "startDate": "2015-12-31"
}
```
3. Execute the following cURL command: 
```
curl http://localhost:8280/services/searchAppointment -d @searchAppointment.json
```
4. Epic will return a json response as below
```json
{
  "resourceType": "Bundle",
  "type": "searchset",
  "total": 2,
  "link": [
    {
      "relation": "self",
      "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure?patient=Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB&date=gt2015-12-31"
    }
  ],
  "entry": [
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/T2ffTCnlLQ-grHJP5yDSZjn5j0NrpKynvAK9vwE7XNDAB",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/T2ffTCnlLQ-grHJP5yDSZjn5j0NrpKynvAK9vwE7XNDAB"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Procedure",
        "status": "completed",
        "notPerformed": false,
        "performedDateTime": "2016-08-06T13:27:00Z",
        "id": "T2ffTCnlLQ-grHJP5yDSZjn5j0NrpKynvAK9vwE7XNDAB",
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
            "value": "988735",
            "type": {
              "text": "ORD"
            }
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.696580",
            "value": "33882",
            "type": {
              "text": "EAP"
            }
          }
        ],
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "code": {
          "text": "CT ABDOMEN W CONTRAST",
          "coding": [
            {
              "system": "http://www.ama-assn.org/go/cpt",
              "code": "74160",
              "display": "CHG CT SCAN OF ABDOMEN CONTRAST"
            }
          ]
        }
      }
    },
    {
      "fullUrl": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/TSHhR7qMWAaHUzPGu5ausdAaCXeK.suMTMs1EiqVcX18B",
      "link": [
        {
          "relation": "self",
          "url": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Procedure/TSHhR7qMWAaHUzPGu5ausdAaCXeK.suMTMs1EiqVcX18B"
        }
      ],
      "search": {
        "mode": "match"
      },
      "resource": {
        "resourceType": "Procedure",
        "status": "completed",
        "notPerformed": false,
        "performedDateTime": "2016-11-23T18:47:00Z",
        "id": "TSHhR7qMWAaHUzPGu5ausdAaCXeK.suMTMs1EiqVcX18B",
        "identifier": [
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.798268",
            "value": "1001984",
            "type": {
              "text": "ORD"
            }
          },
          {
            "use": "usual",
            "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.696580",
            "value": "41423",
            "type": {
              "text": "EAP"
            }
          }
        ],
        "subject": {
          "display": "Jason Argonaut",
          "reference": "https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB"
        },
        "code": {
          "text": "REMOVE STAPLES",
          "coding": [
            {
              "system": "urn:oid:1.2.840.114350.1.13.0.1.7.2.696580",
              "code": "41423",
              "display": "REMOVE STAPLES"
            }
          ]
        }
      }
    }
  ]
}
```