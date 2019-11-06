package com.imooc.sell.form;

import lombok.Data;

/**
 * @author 要子康
 * @description CategoryForm
 * @since 2019/11/9 22:16
 */
@Data
public class CategoryForm {

    /**类目ID */
    private Integer categoryId;

    /**类目名称 */
    private String categoryName;

    /**类目类型 */
    private Integer categoryType;

}
