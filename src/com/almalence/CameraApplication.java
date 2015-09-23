package com.almalence;

import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
import org.acra.sender.HttpSender.Method;
import org.acra.sender.HttpSender.Type;

import android.app.Application;

// @formatter:on
@ReportsCrashes(formUri = "https://rt1shnik.cloudant.com/acra-sidonie/_design/acra-storage/_update/report", reportType = Type.JSON, httpMethod = Method.POST, formUriBasicAuthLogin = "andredenesseeileyetedsta", formUriBasicAuthPassword = "rsg4ALpnyvE3T7bXqHjIj7NG", customReportContent = {
		ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.ANDROID_VERSION,
		ReportField.PACKAGE_NAME, ReportField.REPORT_ID, ReportField.BUILD, ReportField.STACK_TRACE }, mode = ReportingInteractionMode.SILENT)
public class CameraApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		ACRA.init(this);
	}
}
