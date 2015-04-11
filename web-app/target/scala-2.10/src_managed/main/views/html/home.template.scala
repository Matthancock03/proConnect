
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("ProConnect")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*4.32*/routes/*4.38*/.Assets.at("stylesheets/home.min.css"))),format.raw/*4.76*/("""">


<div class="container-fluid">
	<div class="row clearfix">
		"""),_display_(Seq[Any](/*9.4*/navbar/*9.10*/.render())),format.raw/*9.19*/("""
	</div>

	<div class="row clearfix">
		<div class="col-xs-12 column">
		</div>
	</div>

	<div class="row clearfix">
		<div class="col-xs-2 column">
			<img alt="140x140" class = "img-thumbnail profileImage" src="http://i.imgur.com/PcoAz60.jpg?1" />

			<dl class="dl-horizontal">
				<dt>
					Matthew Hancock
				</dt>
				<dd>
					Beyond Prosthetics
				</dd>
				<dd>
					San Jose State University
				</dd>
			</dl>
		</div>

		<div class="col-xs-6 column clearfix">
			<!-- Feedzilla Widget BEGIN -->

				<div class="feedzilla-news-widget feedzilla-9679638077504933" style="width:700px; padding-top: 50px; text-align: center; font-size: 11px; border: 0;">
				<script type="text/javascript" src="http://widgets.feedzilla.com/news/iframe/js/widget.js"></script>
				<script type="text/javascript">
				new FEEDZILLA.Widget("""),format.raw/*40.26*/("""{"""),format.raw/*40.27*/("""
					style: 'slide-top-to-bottom',
					culture_code: 'en_us',
					c: '30',
					sc: '-',
					headerBackgroundColor: '#0C98CF',
					footerBackgroundColor: '#0C98CF',
					title: 'ProConnect',
					order: 'relevance',
					count: '20',
					w: '700',
					h: '500',
					timestamp: 'true',
					scrollbar: 'false',
					theme: 'ui-lightness',
					className: 'feedzilla-9679638077504933'
				"""),format.raw/*56.5*/("""}"""),format.raw/*56.6*/(""");
				</script><br />
				</div>

				<!-- Feedzilla Widget END -->
		</div>
		<div class="col-xs-4 column">
			<div>
				<div class="panel panel-default">
				  <div class="panel-heading">Twitter Feed</div>
				  <div class="panel-body">
						<ul class="list-group overflow-y-scroll tweetTable">
							  <li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
								<li class="list-group-item">First item</li>
							  <li class="list-group-item">Second item</li>
							  <li class="list-group-item">Third item</li>
							</ul>
				  </div>
				</div>
			</div>
		</div>


		</div>

  </div>
</div>
""")))})),format.raw/*85.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 10 15:38:01 PDT 2015
                    SOURCE: C:/Users/Roya/Desktop/proConnect/web-app/app/views/home.scala.html
                    HASH: 29ec02fb70aa04d5285e8e4089490e2db8b0b689
                    MATRIX: 871->18|908->21|934->39|973->41|1041->74|1055->80|1114->118|1219->189|1233->195|1263->204|2153->1066|2182->1067|2620->1478|2648->1479|3411->2211
                    LINES: 30->2|31->3|31->3|31->3|32->4|32->4|32->4|37->9|37->9|37->9|68->40|68->40|84->56|84->56|113->85
                    -- GENERATED --
                */
            