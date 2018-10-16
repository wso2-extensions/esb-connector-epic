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
 "id": "T51iWjMg3MhfQWNRaJpmEF8ALTC6lQcunX-VTNpxqyTiV8.6oSleCNUa5Yr82YE4CJaCO0rcZankXUhpoCWkzlwB"
}
```
>Note: the readById operation can be used to read [practitioner](https://open.epic.com/Clinical/Patient) resource as well as [Medication](https://open.epic.com/Clinical/Medication) resource.

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
 "clinicalStatus": "resolved"
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
 "deviceType": "Pacemaker"
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
 "status": "achieved"
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
    <endEffectiveDate>{$ctx:endEffectiveDate]</endEffectiveDate>
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
 "identifier": "E3814",
 "gender": "female"
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
**Related epic documentation**
[https://open.epic.com/Clinical/Procedure](https://open.epic.com/Clinical/Procedure)

## Sample configuration
Following is a sample proxy service that illustrates how to connect to Epic with the init operation and use the searchObservation operation. 
The sample request for this proxy can be found in searchObservation sample request. You can use this sample as a template for using other operations in this category.

**Sample Proxy**
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