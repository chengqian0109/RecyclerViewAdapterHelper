# RecyclerViewAdapterHelper
A quick base quick adapter of RecyclerView.It bases on [BaseRecyclerViewAdapterHelper](https://raw.githubusercontent.com/CymChad/BaseRecyclerViewAdapterHelper).
# proguard-rules.pro
```
-keep class com.chad.library.adapter.** {
*;
}
-keep public class * extends com.chad.library.adapter.base.BaseQuickAdapter
-keep public class * extends com.chad.library.adapter.base.BaseViewHolder
-keepclassmembers  class **$** extends com.chad.library.adapter.base.BaseViewHolder {
     <init>(...);
}
```
