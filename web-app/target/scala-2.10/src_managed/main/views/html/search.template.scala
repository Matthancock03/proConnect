
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
              						      <div class="col-xs-4 column">
                                  """),_display_(Seq[Any](/*67.36*/if(user.profilePicture != null)/*67.67*/{_display_(Seq[Any](format.raw/*67.68*/("""
                          					<img class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*68.74*/routes/*68.80*/.DbController.getProfilePic(user.email))),format.raw/*68.119*/("""" />
                          				""")))}/*69.32*/else/*69.36*/{_display_(Seq[Any](format.raw/*69.37*/("""
                          					<img alt="140x140" class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*70.88*/routes/*70.94*/.Assets.at("images/profile_holder.png"))),format.raw/*70.133*/("""" />
                          				""")))})),format.raw/*71.32*/("""
                                  </div>
                                  <div class="col-xs-6 column">
                                  <br />
              							       <h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*75.74*/user/*75.78*/.userName)),format.raw/*75.87*/("""</h3>
                      						
                      						<br>
                      						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*78.60*/user/*78.64*/.aboutMe)),format.raw/*78.72*/("""</p>
                                  <p style="padding-top: 10px;">"""),_display_(Seq[Any](/*79.66*/user/*79.70*/.location)),format.raw/*79.79*/("""</p>
                      					</div>
                      				</div>
                				</a>
                			""")))})),format.raw/*83.21*/("""
        		    </div>
              </div>
            <div class="col-xs-2"></div>
          </div>
	</div>




""")))})),format.raw/*93.2*/("""
"""))}
    }
    
    def render(users:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 16:41:47 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/search.scala.html
                    HASH: 02b8631b0822e7902369db05433d85037f1135b2
                    MATRIX: 784->1|919->25|949->47|988->52|1014->70|1053->72|1091->76|1104->82|1132->89|1200->122|1214->128|1274->167|3311->2168|3345->2186|3384->2187|3451->2218|3466->2224|3537->2273|3769->2469|3809->2500|3848->2501|3959->2576|3974->2582|4036->2621|4092->2658|4105->2662|4144->2663|4269->2752|4284->2758|4346->2797|4415->2834|4675->3058|4688->3062|4719->3071|4885->3201|4898->3205|4928->3213|5035->3284|5048->3288|5079->3297|5232->3418|5387->3542
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|90->62|90->62|90->62|91->63|91->63|91->63|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|103->75|103->75|103->75|106->78|106->78|106->78|107->79|107->79|107->79|111->83|121->93
                    -- GENERATED --
                */
            