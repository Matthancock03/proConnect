
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
 """),_display_(Seq[Any](/*4.3*/navbar/*4.9*/.render)),format.raw/*4.16*/("""


<div class="container">
	<div class="row clearfix">
		<div class="col-md-5 column">
			<img alt="140x140" src="http://www.clker.com/cliparts/z/1/T/u/9/2/search-icon-md.png"  width="42" height="42" />
		</div>
	</div>
</div>





<br />
<br />
<br />
<br />










<div class="container">
	<div class="row clearfix">


<li><a href="#search"></a>
  <ul>
  <li><form id="searchbar">
      <input type="text">
      </form></li>
 </ul>
</li>



		<div class="col-md-6 column">
			<h3>
				People Search
				<br />
<br />
<font size="2">
<form action="">
<input type="checkbox" name="vehicle" value="Bike">People<br />
<input type="checkbox" name="vehicle" value="Car">Relationship <br />
<input type="checkbox" name="vehicle" value="Bike">Profession<br />
<input type="checkbox" name="vehicle" value="Car">School<br />
</font>
</form>
		</h3> <a href="#" class="btn" type="button" style="background-color:lightgreen">Search</a>
	


<br />
<br />
<br />
<br />
<br />

<li><a href="#search"></a>
  <ul>
  <li><form id="searchbar">
      <input type="text">
      </form></li>
 </ul>
</li>

		<div class="col-md-6 column">
			<h3>



				Job Search <br />
<br />
<font size="2">
<form action="">
<input type="checkbox" name="vehicle" value="Bike">Jobs<br />
<input type="checkbox" name="vehicle" value="Car">Companies <br />
<input type="checkbox" name="vehicle" value="Bike">Industry<br />
</font>
</form>




			</h3> <a href="#" class="btn" type="button" style="background-color:lightgreen">Search</a>
		</div>
	</div>
</div>



""")))})),format.raw/*103.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Sat May 02 15:10:06 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/search.scala.html
                    HASH: f89b19313b176f7d5dc6ab0e23cb0be0510ee2a9
                    MATRIX: 865->5|891->23|930->25|968->29|981->35|1009->42|1846->848
=======
<<<<<<< HEAD
                    DATE: Sat May 02 15:50:34 MST 2015
                    SOURCE: C:/Users/Eya/Documents/GitHub/proConnect/web-app/app/views/search.scala.html
                    HASH: 053288aef99e36518cf9a46bbf749cb860afb8e4
                    MATRIX: 865->5|891->23|930->25|968->29|981->35|1009->42|2673->1674
                    LINES: 29->3|29->3|29->3|30->4|30->4|30->4|129->103
=======
                    DATE: Sat May 02 13:10:11 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: bff5559246d59439a724c49cbfee133cf614f74d
                    MATRIX: 865->3|891->21|930->23|967->26|980->32|1008->39|1795->795
>>>>>>> b5cd3ede55911f15f7cd40c3fa35efc022e62ba8
                    LINES: 29->3|29->3|29->3|30->4|30->4|30->4|80->54
>>>>>>> 8f9ed6157bd56181ad0b73743b3620babe9daf06
                    -- GENERATED --
                */
            