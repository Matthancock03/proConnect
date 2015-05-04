
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/main("ProConect")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
"""),_display_(Seq[Any](/*4.2*/navbar/*4.8*/.render)),format.raw/*4.15*/("""
<div class="container">
	<div class="row clearfix">
		<div class="col-xs-12 column">
			<div class="page-header">
				<h1>
					Messages
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-2 column">

			<div class="btn-group btn-group-vertical btn-group-md">
			<br /><br /><br />
			 <button type="button" class="btn btn-success">Compose</button>
			 <br />
				 <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em> Inbox</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-center"></em> Sent</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-right"></em> Trash</button> <
			</div>
		</div>
		<div class="col-xs-6 column">

			<table class="table table-condensed" style="background-color: #FFFFFF;">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Message
						</th>
						<th>
							Date
						</th>
						<th>
							Status
						</th>
					</tr>
				</thead>
				<tbody>

					"""),_display_(Seq[Any](/*46.7*/for((message, index) <- messages.zipWithIndex) yield /*46.53*/{_display_(Seq[Any](format.raw/*46.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*49.9*/{index + 1})),format.raw/*49.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*52.49*/index)),format.raw/*52.54*/("""">"""),_display_(Seq[Any](/*52.57*/message/*52.64*/.messageTitle)),format.raw/*52.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*55.9*/message/*55.16*/.tstamp)),format.raw/*55.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*58.9*/if(message.isRead)/*58.27*/{_display_(Seq[Any](format.raw/*58.28*/("""
								Read
							""")))}/*60.9*/else/*60.13*/{_display_(Seq[Any](format.raw/*60.14*/("""
								Unread
							""")))})),format.raw/*62.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*66.15*/index)),format.raw/*66.20*/("""" class="collapse">
						<td>#</td>
						<td colspan="3">"""),_display_(Seq[Any](/*68.24*/message/*68.31*/.messageBody)),format.raw/*68.43*/("""</td>
					</tr>

				""")))})),format.raw/*71.6*/("""
				</tbody>
			</table>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-4 column">
		</div>
		<div class="col-xs-8 column">
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>
""")))})),format.raw/*106.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 10:00:20 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: 019abb08fc8c259fc93995127aaa4d6475b209f6
                    MATRIX: 783->1|902->26|939->29|964->46|1002->47|1038->49|1051->55|1079->62|2183->1131|2245->1177|2284->1178|2349->1208|2382->1219|2490->1291|2517->1296|2556->1299|2572->1306|2607->1319|2678->1355|2694->1362|2723->1369|2790->1401|2817->1419|2856->1420|2896->1442|2909->1446|2948->1447|3003->1471|3078->1510|3105->1515|3201->1575|3217->1582|3251->1594|3305->1617|3842->2122
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|74->46|74->46|74->46|77->49|77->49|80->52|80->52|80->52|80->52|80->52|83->55|83->55|83->55|86->58|86->58|86->58|88->60|88->60|88->60|90->62|94->66|94->66|96->68|96->68|96->68|99->71|134->106
                    -- GENERATED --
                */
            