
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
object profileMain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("ProConnect")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
  """),_display_(Seq[Any](/*3.4*/navbar/*3.10*/.render)),format.raw/*3.17*/("""
  

<div class="container-fluid">
	<div class="row clearfix">
		<div class="col-xs-2 column logo-img img-div">
			<img alt="140x140" class="img-rounded"src="http://lorempixel.com/140/140/" />
      <label for="exampleInputFile">Profile Image</label><input type="file" id="exampleInputFile" />
		</div>
    <div class="col-xs-2 column">
    </div>
		<div class="col-xs-6 column">
      """),_display_(Seq[Any](/*15.8*/helper/*15.14*/.form(action = routes.DbController.home)/*15.54*/{_display_(Seq[Any](format.raw/*15.55*/("""
				<div class="form-group break-after">
					 <label class="spacer">Name</label><input type="text" class="form-control" id="exampleInputEmail1" />
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
    """)))})),format.raw/*73.6*/("""
		</div>
""")))})),format.raw/*75.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 20 16:50:52 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileMain.scala.html
                    HASH: 844cdcc3c7cf1f5a386105ad0085e862c985abd7
                    MATRIX: 870->2|896->20|934->21|972->25|986->31|1014->38|1436->425|1451->431|1500->471|1539->472|4550->3452|4592->3463
                    LINES: 29->2|29->2|29->2|30->3|30->3|30->3|42->15|42->15|42->15|42->15|100->73|102->75
                    -- GENERATED --
                */
            