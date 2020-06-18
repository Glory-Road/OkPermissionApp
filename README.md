# OkPermissionApp
OkPermission是一个用于简化Android运行时权限用法的开源库。
添加如下配置将OkPermission引入到你的项目中：
```groovy
dependencies {
    ...
    implementation 'com.qing:ok-permission:1.0.1'
}
```
然后就可以使用如下语法结构来申请运行时权限了：
```kotlin
OkPermission.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
            if (allGranted) {
                Toast.makeText(this, "通过了", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "未通过", Toast.LENGTH_LONG).show()
            }
        }
```
