//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5
// Visite https://eclipse-ee4j.github.io/jaxb-ri
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
//


package org.example;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element name="Libro" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *                 <attribute name="publicado_en" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "libro"
})
@XmlRootElement(name = "Libros")
public class Libros {

    @XmlElement(name = "Libro")
    protected List<Libros.Libro> libro;

    /**
     * Gets the value of the libro property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libro property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLibro().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Libros.Libro }
     * </p>
     *
     *
     * @return
     *     The value of the libro property.
     */
    public List<Libros.Libro> getLibro() {
        if (libro == null) {
            libro = new ArrayList<>();
        }
        return this.libro;
    }


    /**
     * <p>Clase Java para anonymous complex type.</p>
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
     *
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       </sequence>
     *       <attribute name="publicado_en" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "titulo",
            "autor"
    })
    public static class Libro {

        @XmlElement(name = "Titulo", required = true)
        protected String titulo;
        @XmlElement(name = "Autor", required = true)
        protected String autor;
        @XmlAttribute(name = "publicado_en")
        protected String publicadoEn;

        /**
         * Obtiene el valor de la propiedad titulo.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Define el valor de la propiedad titulo.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTitulo(String value) {
            this.titulo = value;
        }

        /**
         * Obtiene el valor de la propiedad autor.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAutor() {
            return autor;
        }

        /**
         * Define el valor de la propiedad autor.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAutor(String value) {
            this.autor = value;
        }

        /**
         * Obtiene el valor de la propiedad publicadoEn.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPublicadoEn() {
            return publicadoEn;
        }

        /**
         * Define el valor de la propiedad publicadoEn.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPublicadoEn(String value) {
            this.publicadoEn = value;
        }

    }

}
