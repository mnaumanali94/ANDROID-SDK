#Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

## How to Use

The following section explains how to use the DudeReportApi library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *DudeReportApiLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

Clicking the ``` Add ``` button will open a dialog where you need to specify DudeReportApi in ``` Group Id ``` and DudeReportApiLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Dude%20Report%20Api-Java&workspaceName=DudeReportApi&projectName=DudeReportApiLib&rootNamespace=io.dudesolutions.report)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *DudeReportApiLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication and 
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthAccessToken | The OAuth 2.0 access token to be set before API calls |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String oAuthAccessToken = "oAuthAccessToken"; // The OAuth 2.0 access token to be set before API calls

DudeReportApiClient client = new DudeReportApiClient(oAuthAccessToken);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [Heartbeat](#heartbeat)
* [SystemInformation](#system_information)
* [Export](#export)
* [PDF](#pdf)
* [Reports](#reports)
* [Dashboard](#dashboard)

### <a name="heartbeat"></a>![Class: ](http://apidocs.io/img/class.png "io.dudesolutions.report.controllers.Heartbeat") Heartbeat

#### Get singleton instance

The singleton instance of the ``` Heartbeat ``` class can be accessed from the API Client.

```java
Heartbeat heartbeat = client.getHeartbeat();
```

#### <a name="get_heartbeat_check_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Heartbeat.getHeartbeatCheckAsync") getHeartbeatCheckAsync

> The heartbeat is exposed and provided to check for availability of the service.
> Any response that does not provide a ```200 OK``` response code should be treated as an error.


```java
void getHeartbeatCheckAsync(final APICallBack<HeartbeatModel> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
heartbeat.getHeartbeatCheckAsync(new APICallBack<HeartbeatModel>() {
    public void onSuccess(HttpContext context, HeartbeatModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="system_information"></a>![Class: ](http://apidocs.io/img/class.png "io.dudesolutions.report.controllers.SystemInformation") SystemInformation

#### Get singleton instance

The singleton instance of the ``` SystemInformation ``` class can be accessed from the API Client.

```java
SystemInformation systemInformation = client.getSystemInformation();
```

#### <a name="get_si_check_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.SystemInformation.getSICheckAsync") getSICheckAsync

> Retrieve api version, vitals, links, etc.


```java
void getSICheckAsync(final APICallBack<SystemInformationModel> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
systemInformation.getSICheckAsync(new APICallBack<SystemInformationModel>() {
    public void onSuccess(HttpContext context, SystemInformationModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="export"></a>![Class: ](http://apidocs.io/img/class.png "io.dudesolutions.report.controllers.Export") Export

#### Get singleton instance

The singleton instance of the ``` Export ``` class can be accessed from the API Client.

```java
Export export = client.getExport();
```

#### <a name="get_work_orders_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Export.getWorkOrdersAsync") getWorkOrdersAsync

> This collection allows for workorder data to be returned as an excel document.


```java
void getWorkOrdersAsync(
        final GetWorkOrdersInput input,
        final APICallBack<HttpResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| orderby |  ``` Optional ```  | A string describing the ordering to perform on the collection. |
| q |  ``` Optional ```  | A free form filter mechanism. |
| actiontaken |  ``` Optional ```  | Filter by action taken text. |
| assignees |  ``` Optional ```  ``` Collection ```  | {INT} Filter by assignees. |
| completiondatefrom |  ``` Optional ```  | {DATETIME} Filter by completion date, starting from. |
| completiondateto |  ``` Optional ```  | {DATETIME} Filter by completion date, until. |
| createdby |  ``` Optional ```  | {INT} Filter by the user who created the work order. |
| displayid |  ``` Optional ```  | Filter by the display ID of the work order. |
| priority |  ``` Optional ```  | Filter by the priority of work orders. |
| purpose |  ``` Optional ```  ``` Collection ```  | {INT} Filter by the purpose of work orders. |
| requestdatefrom |  ``` Optional ```  | {DATETIME} Filter by request date, starting from. |
| requestdateto |  ``` Optional ```  | {DATETIME} Filter by the request date, until. |
| requestedby |  ``` Optional ```  ``` Collection ```  | {INT} Filter by the work order requester. |
| status |  ``` Optional ```  | Filter by the work order status. |
| workcategory |  ``` Optional ```  ``` Collection ```  | {INT} Filter by the work category assigned to the work order. |
| businessasset |  ``` Optional ```  ``` Collection ```  | Filter by the business asset assigned to the work order. |


#### Example Usage

```java
GetWorkOrdersInput collect = new GetWorkOrdersInput();

int accountId = 1;
collect.setAccountId(accountId);

String orderby = "Quantity asc";
collect.setOrderby(orderby);

String q = "q";
collect.setQ(q);

String actiontaken = "Fixed the chair";
collect.setActiontaken(actiontaken);

String assigneesValue = "[1]";
List<Integer> assignees = mapper.readValue(assigneesValue,new TypeReference<List<Integer>> (){});
collect.setAssignees(assignees);

Date completiondatefrom = 01/01/2015 00:00:00;
collect.setCompletiondatefrom(completiondatefrom);

Date completiondateto = 01/01/2016 00:00:00;
collect.setCompletiondateto(completiondateto);

Integer createdby = 1;
collect.setCreatedby(createdby);

String displayid = "123";
collect.setDisplayid(displayid);

Priority priority = Priority.fromString("Low");
collect.setPriority(priority);

String purposeValue = "[1]";
List<Integer> purpose = mapper.readValue(purposeValue,new TypeReference<List<Integer>> (){});
collect.setPurpose(purpose);

Date requestdatefrom = 01/01/2015 00:00:00;
collect.setRequestdatefrom(requestdatefrom);

Date requestdateto = 01/01/2016 00:00:00;
collect.setRequestdateto(requestdateto);

String requestedbyValue = "[1]";
List<Integer> requestedby = mapper.readValue(requestedbyValue,new TypeReference<List<Integer>> (){});
collect.setRequestedby(requestedby);

Status status = Status.fromString("NewRequest");
collect.setStatus(status);

String workcategoryValue = "[1]";
List<Integer> workcategory = mapper.readValue(workcategoryValue,new TypeReference<List<Integer>> (){});
collect.setWorkcategory(workcategory);

String businessassetValue = "[1]";
List<Double> businessasset = mapper.readValue(businessassetValue,new TypeReference<List<Double>> (){});
collect.setBusinessasset(businessasset);

// Invoking the API call with sample inputs
export.getWorkOrdersAsync(collect, new APICallBack<HttpResponse>() {
    public void onSuccess(HttpContext context, HttpResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="pdf"></a>![Class: ](http://apidocs.io/img/class.png "io.dudesolutions.report.controllers.PDF") PDF

#### Get singleton instance

The singleton instance of the ``` PDF ``` class can be accessed from the API Client.

```java
PDF pDF = client.getPDF();
```

#### <a name="get_work_order_pdf_export_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.PDF.getWorkOrderPDFExportAsync") getWorkOrderPDFExportAsync

> This endpoint returns a work order in a printable PDF format.


```java
void getWorkOrderPDFExportAsync(
        final GetWorkOrderPDFExportInput input,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer. |
| workOrderId |  ``` Required ```  | {INT} ID of the work order in the form of an integer. |
| timeZone |  ``` Optional ```  | A string denoting the time zone. |


#### Example Usage

```java
GetWorkOrderPDFExportInput collect = new GetWorkOrderPDFExportInput();

int accountId = 2;
collect.setAccountId(accountId);

int workOrderId = 12345;
collect.setWorkOrderId(workOrderId);

String timeZone = "Etc/UTC";
collect.setTimeZone(timeZone);

// Invoking the API call with sample inputs
pDF.getWorkOrderPDFExportAsync(collect, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="reports"></a>![Class: ](http://apidocs.io/img/class.png "io.dudesolutions.report.controllers.Reports") Reports

#### Get singleton instance

The singleton instance of the ``` Reports ``` class can be accessed from the API Client.

```java
Reports reports = client.getReports();
```

#### <a name="get_purpose_summary_collection_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Reports.getPurposeSummaryCollectionAsync") getPurposeSummaryCollectionAsync

> This collection allows for workorder data to be organized by purposes and return relevant counts.


```java
void getPurposeSummaryCollectionAsync(
        final GetPurposeSummaryCollectionInput input,
        final APICallBack<GetPurposeSummaryCollectionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| page |  ``` Optional ```  | {INT} The page to request from the collection. |
| pagesize |  ``` Optional ```  | {INT} The number of records to load in a page from the collection. |
| orderby |  ``` Optional ```  | A string describing the ordering to perform on the collection. |


#### Example Usage

```java
GetPurposeSummaryCollectionInput collect = new GetPurposeSummaryCollectionInput();

int accountId = 2;
collect.setAccountId(accountId);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 1000;
collect.setPagesize(pagesize);

String orderby = "Id desc";
collect.setOrderby(orderby);

// Invoking the API call with sample inputs
reports.getPurposeSummaryCollectionAsync(collect, new APICallBack<GetPurposeSummaryCollectionResponseModel>() {
    public void onSuccess(HttpContext context, GetPurposeSummaryCollectionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_failure_summary_collection_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Reports.getFailureSummaryCollectionAsync") getFailureSummaryCollectionAsync

> This collection allows for workorder data to be organized by overall failures and return relevant counts.


```java
void getFailureSummaryCollectionAsync(
        final GetFailureSummaryCollectionInput input,
        final APICallBack<GetFailureSummaryCollectionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| page |  ``` Optional ```  | {INT} The page to request from the collection. |
| pagesize |  ``` Optional ```  | {INT} The number of records to load in a page from the collection. |
| orderby |  ``` Optional ```  | A string describing the ordering to perform on the collection. |


#### Example Usage

```java
GetFailureSummaryCollectionInput collect = new GetFailureSummaryCollectionInput();

int accountId = 2;
collect.setAccountId(accountId);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 1000;
collect.setPagesize(pagesize);

String orderby = "Id desc";
collect.setOrderby(orderby);

// Invoking the API call with sample inputs
reports.getFailureSummaryCollectionAsync(collect, new APICallBack<GetFailureSummaryCollectionResponseModel>() {
    public void onSuccess(HttpContext context, GetFailureSummaryCollectionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_assignee_summary_collection_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Reports.getAssigneeSummaryCollectionAsync") getAssigneeSummaryCollectionAsync

> This collection allows for workorder data to be organized by assignee and return relevant counts.


```java
void getAssigneeSummaryCollectionAsync(
        final GetAssigneeSummaryCollectionInput input,
        final APICallBack<GetAssigneeSummaryCollectionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| page |  ``` Optional ```  | {INT} The page to request from the collection. |
| pagesize |  ``` Optional ```  | {INT} The number of records to load in a page from the collection. |
| orderby |  ``` Optional ```  | A string describing the ordering to perform on the collection. |


#### Example Usage

```java
GetAssigneeSummaryCollectionInput collect = new GetAssigneeSummaryCollectionInput();

int accountId = 2;
collect.setAccountId(accountId);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 1000;
collect.setPagesize(pagesize);

String orderby = "Id desc";
collect.setOrderby(orderby);

// Invoking the API call with sample inputs
reports.getAssigneeSummaryCollectionAsync(collect, new APICallBack<GetAssigneeSummaryCollectionResponseModel>() {
    public void onSuccess(HttpContext context, GetAssigneeSummaryCollectionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_asset_summary_collection_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Reports.getAssetSummaryCollectionAsync") getAssetSummaryCollectionAsync

> This collection allows for workorder data to be organized by asset and return relevant counts.


```java
void getAssetSummaryCollectionAsync(
        final GetAssetSummaryCollectionInput input,
        final APICallBack<GetAssetSummaryCollectionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| page |  ``` Optional ```  | {INT} The page to request from the collection. |
| pagesize |  ``` Optional ```  | {INT} The number of records to load in a page from the collection. |
| orderby |  ``` Optional ```  | A string describing the ordering to perform on the collection. |


#### Example Usage

```java
GetAssetSummaryCollectionInput collect = new GetAssetSummaryCollectionInput();

int accountId = 2;
collect.setAccountId(accountId);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 1000;
collect.setPagesize(pagesize);

String orderby = "Id desc";
collect.setOrderby(orderby);

// Invoking the API call with sample inputs
reports.getAssetSummaryCollectionAsync(collect, new APICallBack<GetAssetSummaryCollectionResponseModel>() {
    public void onSuccess(HttpContext context, GetAssetSummaryCollectionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="get_asset_failure_reason_collection_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Reports.getAssetFailureReasonCollectionAsync") getAssetFailureReasonCollectionAsync

> This collection allows for workorder data to be organized by asset failure reasons and return relevant counts.


```java
void getAssetFailureReasonCollectionAsync(
        final GetAssetFailureReasonCollectionInput input,
        final APICallBack<GetAssetFailureReasonCollectionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| assetId |  ``` Required ```  | TODO: Add a parameter description |
| page |  ``` Optional ```  | {INT} The page to request from the collection. |
| pagesize |  ``` Optional ```  | {INT} The number of records to load in a page from the collection. |
| orderby |  ``` Optional ```  | A string describing the ordering to perform on the collection. |


#### Example Usage

```java
GetAssetFailureReasonCollectionInput collect = new GetAssetFailureReasonCollectionInput();

int accountId = 2;
collect.setAccountId(accountId);

double assetId = 1;
collect.setAssetId(assetId);

Integer page = 1;
collect.setPage(page);

Integer pagesize = 1000;
collect.setPagesize(pagesize);

String orderby = "Id desc";
collect.setOrderby(orderby);

// Invoking the API call with sample inputs
reports.getAssetFailureReasonCollectionAsync(collect, new APICallBack<GetAssetFailureReasonCollectionResponseModel>() {
    public void onSuccess(HttpContext context, GetAssetFailureReasonCollectionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="dashboard"></a>![Class: ](http://apidocs.io/img/class.png "io.dudesolutions.report.controllers.Dashboard") Dashboard

#### Get singleton instance

The singleton instance of the ``` Dashboard ``` class can be accessed from the API Client.

```java
Dashboard dashboard = client.getDashboard();
```

#### <a name="get_on_time_ratio_async"></a>![Method: ](http://apidocs.io/img/method.png "io.dudesolutions.report.controllers.Dashboard.getOnTimeRatioAsync") getOnTimeRatioAsync

> This endpoint returns counts of work orders on time and over due for the given time frame base on scheduled date.


```java
void getOnTimeRatioAsync(
        final GetOnTimeRatioInput input,
        final APICallBack<OnTimeRatioModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountId |  ``` Required ```  | {INT} ID of the account in the form of an integer |
| startDate |  ``` Required ```  | {DATETIME} The start date and time in ISO-8601 |
| endDate |  ``` Required ```  | {DATETIME} The end date and time in ISO-8601 |


#### Example Usage

```java
GetOnTimeRatioInput collect = new GetOnTimeRatioInput();

int accountId = 2;
collect.setAccountId(accountId);

Date startDate = 01/01/2015 00:00:00;
collect.setStartDate(startDate);

Date endDate = 01/07/2015 00:00:00;
collect.setEndDate(endDate);

// Invoking the API call with sample inputs
dashboard.getOnTimeRatioAsync(collect, new APICallBack<OnTimeRatioModel>() {
    public void onSuccess(HttpContext context, OnTimeRatioModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)



