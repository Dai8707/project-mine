package com.modularhub.feature.mine

data class MineMenuItem(val title: String, val subtitle: String)

object MineMockData {
    const val USER_NAME = "ModularHub 用户"
    const val USER_LEVEL = "普通会员"

    fun menus(): List<MineMenuItem> = listOf(
        MineMenuItem("我的订单", "3 笔待发货"),
        MineMenuItem("收货地址", "默认：上海市浦东新区"),
        MineMenuItem("优惠券", "2 张可用"),
        MineMenuItem("客服中心", "9:00 - 21:00"),
        MineMenuItem("设置", "账号与安全"),
    )
}
