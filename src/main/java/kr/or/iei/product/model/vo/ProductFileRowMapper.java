package kr.or.iei.product.model.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductFileRowMapper implements RowMapper<ProductFile> {

	@Override
	public ProductFile mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductFile file = new ProductFile();
		file.setFilename(rs.getString("filename"));
		file.setFileNo(rs.getInt("file_no"));
		file.setFilepath(rs.getString("filepath"));
		file.setProductNo(rs.getInt("product_no"));
		return file;
	}

}
