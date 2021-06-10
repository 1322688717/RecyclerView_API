package com.example.recyclerapi;

//import android.text.TextUtils;
//
//import com.newdadabus.common.utils.TimeUtil;
//import com.newdadabus.entity.MyOrderInfo;
//import com.newdadabus.entity.MyOrderInfo.Order;

//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//
///**
// * 我的订单 班车 旧
// *
// * @author blue
// */
//public class MyOrderParser extends JsonParser {
//	public MyOrderInfo myOrderInfo;
//	private ArrayList<Order> orderList;
//	private Order order;
//	private JSONObject orderObj;
//
//	@Override
//	public void parser(JSONObject json) throws Exception {
//		if (json != null && !"".equals(json)) {
//			JSONObject jsonObject = json.optJSONObject("data");
//
//			if (null != jsonObject) {
//				myOrderInfo = new MyOrderInfo();
//				orderList = new ArrayList<Order>();
//
//				myOrderInfo.totalCount = jsonObject.optString("total_count");
//				myOrderInfo.curPageIndex = jsonObject.optString("cur_page_index");
//				myOrderInfo.curPageSize = jsonObject.optString("cur_page_size");
//
//				JSONArray orderListArr = jsonObject.optJSONArray("order_list");
//
//				int orderListSize = orderListArr.length();
//
//				for (int i = 0; i < orderListSize; i++) {
//					orderObj = orderListArr.optJSONObject(i);
//					order = new MyOrderInfo().new Order();
//
//					order.orderNumber = orderObj.optString("order_number");
//					order.createTime = TimeUtil.parseStringToDate(orderObj.optString("create_time"));
//					order.price = orderObj.optString("price");
//					order.realPrice = orderObj.optString("real_price");
//					order.couponPrice = orderObj.optString("coupon_price");
//					order.couponUsed = orderObj.optString("coupon_used");
//					order.onSiteName = orderObj.optString("on_site_name");
//					order.offSiteName = orderObj.optString("off_site_name");
//					order.status = orderObj.optString("status");
//					order.isRefund = orderObj.optString("is_refund");
//					order.payType = orderObj.optString("pay_type");
//					//判空和长度判断
//					String startTime = orderObj.optString("start_time", "00:00:00");
//					boolean isTrueStartTime = !TextUtils.isEmpty(startTime) && startTime.length()>5;
//					order.startTime = isTrueStartTime? startTime.substring(0,5):startTime;
//
//					order.togLineId = orderObj.optString("tog_line_id");
//					order.lineCode = orderObj.optString("line_code");
//					order.buyCount = orderObj.optString("buy_count");
//					order.mileage = orderObj.optString("mileage");
//					order.takeTime = orderObj.optString("take_time");
//					order.lineCard = orderObj.optString("line_card");
//					order.refundTimes = orderObj.optInt("refund_times");
//					order.onSiteType = orderObj.optInt("on_site_type");
//					order.offSiteType = orderObj.optInt("off_site_type");
//
//					order.originalPrice = orderObj.optString("original_price");
//					order.ticketType = orderObj.optString("ticket_type");
//					order.payEndTime = orderObj.optString("pay_end_time");
//					order.preSaleFlag = orderObj.optInt("pre_sale_flag");
//					order.mainLineType = orderObj.optInt("main_line_type");
//					order.totalAmount = orderObj.optInt("total_amount");
//					order.descript = orderObj.optString("descript");
//					order.lineTypeName = orderObj.optString("line_type_name");
//
//					orderList.add(order);
//				}
//
//				myOrderInfo.orderList = orderList;
//
//			}
//
//		}
//	}
//
//}
