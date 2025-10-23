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
 *       <sequence>
 *         <element name="mamifer" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="especie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="nom_comu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="dieta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="habitat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *                 <attribute name="perill_extincio" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <enumeration value="sí"/>
 *                       <enumeration value="no"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "mamifer"
})
@XmlRootElement(name = "mamifers")
public class Mamifers {

    @XmlElement(required = true)
    protected List<Mamifers.Mamifer> mamifer;

    /**
     * Gets the value of the mamifer property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mamifer property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMamifer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mamifers.Mamifer }
     * </p>
     *
     *
     * @return
     *     The value of the mamifer property.
     */
    public List<Mamifers.Mamifer> getMamifer() {
        if (mamifer == null) {
            mamifer = new ArrayList<>();
        }
        return this.mamifer;
    }

    public void mostrarMamifers(){
        for (int i = 0; i < this.getMamifer().size(); i++) {
            Mamifer mamifer = this.getMamifer().get(i);
            mamifer.mostrarDatos();
        }
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
     *         <element name="especie" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="nom_comu" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="dieta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="habitat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       </sequence>
     *       <attribute name="perill_extincio" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <enumeration value="sí"/>
     *             <enumeration value="no"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "especie",
            "nomComu",
            "dieta",
            "habitat"
    })
    public static class Mamifer {

        @XmlElement(required = true)
        protected String especie;
        @XmlElement(name = "nom_comu", required = true)
        protected String nomComu;
        @XmlElement(required = true)
        protected String dieta;
        @XmlElement(required = true)
        protected String habitat;
        @XmlAttribute(name = "perill_extincio", required = true)
        protected String perillExtincio;

        /**
         * Obtiene el valor de la propiedad especie.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEspecie() {
            return especie;
        }

        /**
         * Define el valor de la propiedad especie.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEspecie(String value) {
            this.especie = value;
        }

        /**
         * Obtiene el valor de la propiedad nomComu.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNomComu() {
            return nomComu;
        }

        /**
         * Define el valor de la propiedad nomComu.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNomComu(String value) {
            this.nomComu = value;
        }

        /**
         * Obtiene el valor de la propiedad dieta.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDieta() {
            return dieta;
        }

        /**
         * Define el valor de la propiedad dieta.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDieta(String value) {
            this.dieta = value;
        }

        /**
         * Obtiene el valor de la propiedad habitat.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHabitat() {
            return habitat;
        }

        /**
         * Define el valor de la propiedad habitat.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHabitat(String value) {
            this.habitat = value;
        }

        /**
         * Obtiene el valor de la propiedad perillExtincio.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPerillExtincio() {
            return perillExtincio;
        }

        /**
         * Define el valor de la propiedad perillExtincio.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPerillExtincio(String value) {
            this.perillExtincio = value;
        }

        public void mostrarDatos() {
            System.out.println(
                    "Mamifer" + "\n" +
                    " - Especie = " + especie + '\n' +
                    " - NomComu = " + nomComu + '\n' +
                    " - Dieta = " + dieta + '\n' +
                    " - Habitat = " + habitat + '\n' +
                    " - Perill Extincio = " + perillExtincio + '\n' +
                    "=======================" + "\n"
            );
        }
    }

}
