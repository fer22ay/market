/**
 * 
 */
package com.fernando.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.fernando.market.domain.Category;
import com.fernando.market.persistence.entity.Categoria;

/**
 * @author Fernando Ambrosio
 * @since : 03/10/2020
 *
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {

	@Mappings({ @Mapping(source = "idCategoria", target = "categoryId"),
			@Mapping(source = "descripcion", target = "category"), @Mapping(source = "estado", target = "active") })
	Category toCategory(Categoria categoria);

	/**
	 * Con la anotación {@code InheritInverseConfiguration} le indicamos a mapStruct
	 * que realice el inverso de la anotación anterior.
	 * 
	 * @param category de tipo entidad Category
	 * @return
	 */
	@InheritInverseConfiguration
	@Mapping(target = "productos", ignore = true)
	Categoria toCategoria(Category category);

}
