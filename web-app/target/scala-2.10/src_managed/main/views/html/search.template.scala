
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[UserModel],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[UserModel]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConnect")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
 """),_display_(Seq[Any](/*7.3*/navbar/*7.9*/.render)),format.raw/*7.16*/("""


<div class="container">
	<div class="row clearfix">
		<div class="col-xs-5 column">
			<img alt="140x140" src="http://www.clker.com/cliparts/z/1/T/u/9/2/search-icon-md.png"  width="42" height="42" />
		</div>
	</div>


	<div class="row clearfix">

		<div class="col-xs-6 column">
			<h3>
				People Search</h3><br />

        <font size="2">
        <form action="" role="form">
          <div class="form-group">
              <input type="text" class="form-control">
              <br />
              <input type="checkbox" name="vehicle" value="Bike">People<br />
              <input type="checkbox" name="vehicle" value="Car">Relationship <br />
              <input type="checkbox" name="vehicle" value="Bike">Profession<br />
              <input type="checkbox" name="vehicle" value="Car">School<br />
            </font>
              <a href="#" class="btn" type="button" style="background-color:lightgreen">Search</a>
          </div>
          </form>
        </div>


      		<div class="col-xs-6 column">
      			   <h3>Job Search 		</h3><br />

                <font size="2">
                <form action="" role="form">
                   <div class="form-group">
                    <input type="text" class="form-control">
                    <br />
                    <input type="checkbox" name="vehicle" value="Bike">Jobs<br />
                    <input type="checkbox" name="vehicle" value="Car">Companies <br />
                    <input type="checkbox" name="vehicle" value="Bike">Industry<br />
                    </font>
                    <a href="#" class="btn" type="button" style="background-color:lightgreen">Search</a>
                    </div>
                </form>
              </div>
            </div>
                <div class="row clearfix">
                  <div class="col-xs-3"></div>
                  <div class="col-xs-6">
                    <div class="feed-div">
              			"""),_display_(Seq[Any](/*61.19*/for(user <- users) yield /*61.37*/{_display_(Seq[Any](format.raw/*61.38*/("""
              					<a href="#">
              					<div class="panel panel-default">
              						<div class="panel-body">
              						      <div>
                                  """),_display_(Seq[Any](/*66.36*/if(user.profilePicture != null)/*66.67*/{_display_(Seq[Any](format.raw/*66.68*/("""
                          					<img class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*67.74*/routes/*67.80*/.DbController.getProfilePic(user.email))),format.raw/*67.119*/("""" />
                          				""")))}/*68.32*/else/*68.36*/{_display_(Seq[Any](format.raw/*68.37*/("""
                          					<img alt="140x140" class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*69.88*/routes/*69.94*/.Assets.at("images/profile_holder.png"))),format.raw/*69.133*/("""" />
                          				""")))})),format.raw/*70.32*/("""
              							       <h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*71.74*/user/*71.78*/.userName)),format.raw/*71.87*/("""</h3>
                      						</div>
                      						<br>
                      						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*74.60*/user/*74.64*/.aboutMe)),format.raw/*74.72*/("""</p>
                                  <p style="padding-top: 10px;">"""),_display_(Seq[Any](/*75.66*/user/*75.70*/.location)),format.raw/*75.79*/("""</p>
                      					</div>
                      				</div>
                				</a>
                			""")))})),format.raw/*79.21*/("""
        		    </div>
              </div>
            <div class="col-xs-3"></div>
          </div>
	</div>




""")))})),format.raw/*89.2*/("""
"""))}
    }
    
    def render(users:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 03 21:17:32 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: fbc8077a73eba8188846e96161163a86cfac8bb6
                    MATRIX: 784->1|918->25|946->44|983->47|1009->65|1048->67|1085->70|1098->76|1126->83|3107->2028|3141->2046|3180->2047|3414->2245|3454->2276|3493->2277|3603->2351|3618->2357|3680->2396|3735->2432|3748->2436|3787->2437|3911->2525|3926->2531|3988->2570|4056->2606|4166->2680|4179->2684|4210->2693|4379->2826|4392->2830|4422->2838|4528->2908|4541->2912|4572->2921|4721->3038|4866->3152
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|89->61|89->61|89->61|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|99->71|99->71|99->71|102->74|102->74|102->74|103->75|103->75|103->75|107->79|117->89
                    -- GENERATED --
                */
            