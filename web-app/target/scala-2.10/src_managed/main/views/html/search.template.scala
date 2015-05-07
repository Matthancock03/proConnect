
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
              			"""),_display_(Seq[Any](/*60.19*/for(user <- users) yield /*60.37*/{_display_(Seq[Any](format.raw/*60.38*/("""
              					<a href=""""),_display_(Seq[Any](/*61.30*/routes/*61.36*/.SearchController.loadSearchedProfile(user.email))),format.raw/*61.85*/("""">
              					<div class="panel panel-default">
              						<div class="panel-body">
              						      <div class="col-xs-4 column">
                                  """),_display_(Seq[Any](/*65.36*/if(user.profilePicture != null)/*65.67*/{_display_(Seq[Any](format.raw/*65.68*/("""
                          					<img class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*66.74*/routes/*66.80*/.DbController.getProfilePic(user.email))),format.raw/*66.119*/("""" />
                          				""")))}/*67.32*/else/*67.36*/{_display_(Seq[Any](format.raw/*67.37*/("""
                          					<img alt="140x140" class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*68.88*/routes/*68.94*/.Assets.at("images/profile_holder.png"))),format.raw/*68.133*/("""" />
                          				""")))})),format.raw/*69.32*/("""
                                  </div>
                                  <div class="col-xs-6 column">
                                  <br />
              							       <h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*73.74*/user/*73.78*/.userName)),format.raw/*73.87*/("""</h3>

                      						<br>
                      						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*76.60*/user/*76.64*/.aboutMe)),format.raw/*76.72*/("""</p>
                                  <p style="padding-top: 10px;">"""),_display_(Seq[Any](/*77.66*/user/*77.70*/.location)),format.raw/*77.79*/("""</p>
                      					</div>
                      				</div>
                				</a>
                			""")))})),format.raw/*81.21*/("""
        		    </div>
              </div>
            <div class="col-xs-2"></div>
          </div>
	</div>




""")))})),format.raw/*91.2*/("""
"""))}
    }
    
    def render(users:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 23:21:57 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: 4b928b206ca9d0b2891d9b9a75d60c60493a445a
                    MATRIX: 784->1|918->25|946->44|983->47|1009->65|1048->67|1085->70|1098->76|1126->83|1193->115|1207->121|1267->160|1673->530|1688->536|1736->562|3215->2005|3249->2023|3288->2024|3354->2054|3369->2060|3440->2109|3668->2301|3708->2332|3747->2333|3857->2407|3872->2413|3934->2452|3989->2488|4002->2492|4041->2493|4165->2581|4180->2587|4242->2626|4310->2662|4566->2882|4579->2886|4610->2895|4745->2994|4758->2998|4788->3006|4894->3076|4907->3080|4938->3089|5087->3206|5232->3320
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|54->26|54->26|54->26|88->60|88->60|88->60|89->61|89->61|89->61|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|101->73|101->73|101->73|104->76|104->76|104->76|105->77|105->77|105->77|109->81|119->91
                    -- GENERATED --
                */
            