
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
object profileMain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConnect")/*5.20*/{_display_(Seq[Any](format.raw/*5.21*/("""
  """),_display_(Seq[Any](/*6.4*/navbar/*6.10*/.render)),format.raw/*6.17*/("""


<div class="container-fluid">
	<div class="row clearfix">
		<div class="col-xs-2 column logo-img img-div">
 
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*13.71*/routes/*13.77*/.Assets.at("images/profile_holder.png"))),format.raw/*13.116*/("""" />
        
        <label for="exampleInputFile">Profile Image</label><input type="file" id="exampleInputFile" />
		</div>
    <div class="col-xs-2 column">
    </div>
		<div class="col-xs-6 column">
      """),_display_(Seq[Any](/*20.8*/helper/*20.14*/.form(action = routes.NewsFeed.homeFeed)/*20.54*/{_display_(Seq[Any](format.raw/*20.55*/("""
				<div class="form-group break-after">
					 <label class="spacer">Name</label>"""),_display_(Seq[Any](/*22.42*/helper/*22.48*/.inputText(user("username"), 'class -> "form-control"))),format.raw/*22.102*/("""
           """),_display_(Seq[Any](/*23.13*/helper/*23.19*/.input(user("email"))/*23.40*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.69*/("""
            <input type="text" name=""""),_display_(Seq[Any](/*24.39*/name)),format.raw/*24.43*/("""" id=""""),_display_(Seq[Any](/*24.50*/id)),format.raw/*24.52*/("""" """),_display_(Seq[Any](/*24.55*/toHtmlArgs(args))),format.raw/*24.71*/(""">
            """)))})),format.raw/*25.14*/("""
					 <label class="spacer-min">Personal Headline</label><input type="text"  class="form-control" id="exampleInputPassword1" />
           <label class="spacer-min">Location</label><input type="text"  class="form-control" id="exampleInputPassword1" />
           <label class="spacer-min">Current Employer</label><input type="text"  class="form-control" id="exampleInputPassword1" />
				</div>

		</div>
    <div class="col-xs-2 column"></div>
	</div>
	<div class="row clearfix">
    <div class="col-xs-2 column logo-img"></div>
		<div class="col-xs-8 column">
          <div class="break-after">
          <label class="spacer" for="comment">About Me:</label>
            <textarea class="form-control" rows="4" id="comment"></textarea>
          </div>
          <div class="break-after">
          <label class="spacer" for="comment">Experience:</label>
            <textarea class="form-control" rows="4" id="comment"></textarea>
            <div>
            <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
            </button>
            <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
              <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
            </button>
          </div>
          </div>
          <div class="break-after">
          <label class="spacer" for="comment">Projects Or Skills Highlight:</label>
              <textarea class="form-control" rows="4" id="comment"></textarea>
              <div>
              <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
              </button>
              <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
              </button>
            </div>
            </div>
            <div class="break-after">
              <label class="spacer" for="comment">Education:</label>
                <textarea class="form-control" rows="4" id="comment"></textarea>
                <div>
                <button type="button" class="btn btn-danger  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                </button>
                <button type="button" class="btn btn-info  btn-xs" aria-label="left Align">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
              </div>
          </div>
          <button type="submit" class="btn save-button">Submit</button>
    </div>
      </div>
      <div class="col-xs-2 column bottom-div"></div>
    """)))})),format.raw/*81.6*/("""
		</div>
""")))})),format.raw/*83.2*/("""
"""))}
    }
    
    def render(user:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 24 15:59:39 PDT 2015
                    SOURCE: /home/beyondprosthetics/repos/school/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: 82264033cca6870376861f09c1d113eb674170cc
                    MATRIX: 784->1|912->19|940->38|976->40|1002->58|1040->59|1078->63|1092->69|1120->76|1338->258|1353->264|1415->303|1660->513|1675->519|1724->559|1763->560|1882->643|1897->649|1974->703|2023->716|2038->722|2068->743|2135->772|2210->811|2236->815|2279->822|2303->824|2342->827|2380->843|2427->858|5290->3690|5332->3701
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|41->13|41->13|41->13|48->20|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|52->24|52->24|53->25|109->81|111->83
                    -- GENERATED --
                */
            