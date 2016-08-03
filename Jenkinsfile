node {
    stage 'Checkout' 
        checkout scm
        stage 'Build test'
        sh 'gradle assembleAndroidTest'
        sh  "adb wait-for-device push ./TesterLibLib/ build/outputs/apk/TesterLibLib-debug-androidTestunaligned.apk /data/local/tmp/org3000.hopto.apimatic.test"
        
    stage 'Install'
        sh  'adb wait-for-device shell pm install -r "/data/ local/tmp/org3000.hopto.apimatic.test"'
   
    stage 'Test'
        sh  'adb wait-for-device shell am instrument -w -r   -e package org3000.hopto.apimatic -e debug false org3000.hopto.apimatic.test/ android.support.test.runner.AndroidJUnitRunner'
    }