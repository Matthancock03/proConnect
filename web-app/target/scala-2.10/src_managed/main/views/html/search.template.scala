
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
        <form action=""""),_display_(Seq[Any](/*26.24*/routes/*26.30*/.SearchController.search())),format.raw/*26.56*/("""" role="search">
          <div class="form-group">
              <input type="text" class="form-control" name="searchParameter">
              <br />
              <input type="checkbox" name="profession" value="true">Profession<br />
              <input type="checkbox" name="skill" value="true">Skill<br />
            </font>
              <button class="btn" type="submit" style="background-color:lightgreen">Search</button>
          </div>
          </form>
        </div>


      		<div class="col-xs-6 column">
      			   <h3>Job Search 		</h3><br />

                <font size="2">
                  <form action=""""),_display_(Seq[Any](/*43.34*/routes/*43.40*/.SearchController.jobSearch())),format.raw/*43.69*/("""" role="search">
                   <div class="form-group">
                     <input type="text" class="form-control" name="searchParameter">
                    <br />
                    <input type="checkbox" name="company" value="true">Company<br />
                    <input type="checkbox" name="industry" value="true">Industry<br />
                    </font>
                    <button class="btn" type="submit" style="background-color:lightgreen">Search</button>
                    </div>
                </form>
              </div>
            </div>
                <div class="row clearfix">
                  <div class="col-xs-2"></div>
                  <div class="col-xs-8">
                    <div class="feed-div">
              			"""),_display_(Seq[Any](/*59.19*/for(user <- users) yield /*59.37*/{_display_(Seq[Any](format.raw/*59.38*/("""
              					<a href=""""),_display_(Seq[Any](/*60.30*/routes/*60.36*/.SearchController.loadSearchedProfile(user.email))),format.raw/*60.85*/("""">
              					<div class="panel panel-default">
              						<div class="panel-body">
              						      <div class="col-xs-4 column">
                                  """),_display_(Seq[Any](/*64.36*/if(user.profilePicture != null)/*64.67*/{_display_(Seq[Any](format.raw/*64.68*/("""
                          					<img class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*65.74*/routes/*65.80*/.DbController.getProfilePic(user.email))),format.raw/*65.119*/("""" />
                          				""")))}/*66.32*/else/*66.36*/{_display_(Seq[Any](format.raw/*66.37*/("""
                          					<img alt="140x140" class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*67.88*/routes/*67.94*/.Assets.at("images/profile_holder.png"))),format.raw/*67.133*/("""" />
                          				""")))})),format.raw/*68.32*/("""
                                  </div>
                                  <div class="col-xs-6 column">
                                  <br />
              							       <h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*72.74*/user/*72.78*/.userName)),format.raw/*72.87*/("""</h3>

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
                    DATE: Thu May 07 00:00:28 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: 44bbc2fe52ff6973119bb930c12de4c0ac060971
                    MATRIX: 784->1|918->25|946->44|983->47|1009->65|1048->67|1085->70|1098->76|1126->83|1193->115|1207->121|1267->160|1673->530|1688->536|1736->562|2400->1190|2415->1196|2466->1225|3264->1987|3298->2005|3337->2006|3403->2036|3418->2042|3489->2091|3717->2283|3757->2314|3796->2315|3906->2389|3921->2395|3983->2434|4038->2470|4051->2474|4090->2475|4214->2563|4229->2569|4291->2608|4359->2644|4615->2864|4628->2868|4659->2877|4794->2976|4807->2980|4837->2988|4943->3058|4956->3062|4987->3071|5136->3188|5281->3302
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|54->26|54->26|54->26|71->43|71->43|71->43|87->59|87->59|87->59|88->60|88->60|88->60|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|100->72|100->72|100->72|103->75|103->75|103->75|104->76|104->76|104->76|108->80|118->90
                    -- GENERATED --
                */
            