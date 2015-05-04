
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConnect")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
 """),_display_(Seq[Any](/*7.3*/navbar/*7.9*/.render)),format.raw/*7.16*/("""


<div class="container">
	<div class="row clearfix">
		<div class="col-md-5 column">
			<img alt="140x140" src="http://www.clker.com/cliparts/z/1/T/u/9/2/search-icon-md.png"  width="42" height="42" />
		</div>
	</div>



<br />
<br />
<br />
<br />

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
</div>


""")))})),format.raw/*93.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 18:51:03 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: 7916f94074365e0bf3c6132947eec1b40aa3eacc
                    MATRIX: 778->1|904->17|932->36|969->39|995->57|1034->59|1071->62|1084->68|1112->75|2641->1573
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|121->93
                    -- GENERATED --
                */
            