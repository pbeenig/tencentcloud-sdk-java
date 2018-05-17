package com.tencentcloudapi.es.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteInstanceRequest  extends AbstractModel{


    /**
    * 要销毁的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
     * 获取要销毁的实例ID
     * @return InstanceId 要销毁的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置要销毁的实例ID
     * @param InstanceId 要销毁的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}
