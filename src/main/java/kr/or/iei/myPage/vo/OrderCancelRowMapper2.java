package kr.or.iei.myPage.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class OrderCancelRowMapper2 implements RowMapper<OrderCancel>{

	@Override
	@Nullable
	public OrderCancel mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderCancel oc = new OrderCancel();
		oc.setOrderNo(rs.getLong("order_no"));
		oc.setProductName(rs.getString("product_name"));
		oc.setMemberName(rs.getString("member_name"));
		oc.setMemberAddr(rs.getString("member_addr"));
		oc.setOrderStatus(rs.getInt("order_Status"));
		return oc;
	}

}