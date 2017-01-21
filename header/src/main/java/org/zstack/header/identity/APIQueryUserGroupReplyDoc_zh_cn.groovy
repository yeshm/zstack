package org.zstack.header.identity

import org.zstack.header.errorcode.ErrorCode

doc {

    title "用户组清单列表"

    ref {
        name "error"
        path "org.zstack.header.identity.APIQueryUserGroupReply.error"
        desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null", false
        type "ErrorCode"
        since "0.6"
        clz ErrorCode.class
    }
    ref {
        name "inventories"
        path "org.zstack.header.identity.APIQueryUserGroupReply.inventories"
        desc "用户组清单列表"
        type "List"
        since "0.6"
        clz UserGroupInventory.class
    }
}