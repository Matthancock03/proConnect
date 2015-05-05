
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
 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.32*/routes/*8.38*/.Assets.at("stylesheets/index.min.css"))),format.raw/*8.77*/("""">


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
                  <div class="col-xs-2"></div>
                  <div class="col-xs-8">
                    <div class="feed-div">
              			"""),_display_(Seq[Any](/*62.19*/for(user <- users) yield /*62.37*/{_display_(Seq[Any](format.raw/*62.38*/("""
              					<a href=""""),_display_(Seq[Any](/*63.30*/routes/*63.36*/.SearchController.loadSearchedProfile(user.email))),format.raw/*63.85*/("""">
              					<div class="panel panel-default">
              						<div class="panel-body">
              						      <div>
                                  """),_display_(Seq[Any](/*67.36*/if(user.profilePicture != null)/*67.67*/{_display_(Seq[Any](format.raw/*67.68*/("""
                          					<img class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*68.74*/routes/*68.80*/.DbController.getProfilePic(user.email))),format.raw/*68.119*/("""" />
                          				""")))}/*69.32*/else/*69.36*/{_display_(Seq[Any](format.raw/*69.37*/("""
                          					<img alt="140x140" class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*70.88*/routes/*70.94*/.Assets.at("images/profile_holder.png"))),format.raw/*70.133*/("""" />
                          				""")))})),format.raw/*71.32*/("""
              							       <h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*72.74*/user/*72.78*/.userName)),format.raw/*72.87*/("""</h3>
                      						</div>
                      						<br>
                      						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*75.60*/user/*75.64*/.aboutMe)),format.raw/*75.72*/("""</p>
                                  <p style="padding-top: 10px;">"""),_display_(Seq[Any](/*76.66*/user/*76.70*/.location)),format.raw/*76.79*/("""</p>
                      					</div>
                      				</div>
                				</a>
                			""")))})),format.raw/*80.21*/("""
        		    </div>
              </div>
            <div class="col-xs-2"></div>
          </div>
	</div>




""")))})),format.raw/*90.2*/("""
"""))}
    }
    
    def render(users:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 11:02:40 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: 347f381bfa16043fcd7ea6e4efe2e15574b62109
                    MATRIX: 784->1|918->25|946->44|983->47|1009->65|1048->67|1085->70|1098->76|1126->83|1193->115|1207->121|1267->160|3250->2107|3284->2125|3323->2126|3389->2156|3404->2162|3475->2211|3679->2379|3719->2410|3758->2411|3868->2485|3883->2491|3945->2530|4000->2566|4013->2570|4052->2571|4176->2659|4191->2665|4253->2704|4321->2740|4431->2814|4444->2818|4475->2827|4644->2960|4657->2964|4687->2972|4793->3042|4806->3046|4837->3055|4986->3172|5131->3286
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|90->62|90->62|90->62|91->63|91->63|91->63|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|100->72|100->72|100->72|103->75|103->75|103->75|104->76|104->76|104->76|108->80|118->90
                    -- GENERATED --
                */
            