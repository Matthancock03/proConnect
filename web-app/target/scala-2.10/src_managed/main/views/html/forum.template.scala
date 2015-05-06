
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
object forum extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Forum],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forumItems: List[Forum]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""
"""),_display_(Seq[Any](/*2.2*/main("ProConnect")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
  """),_display_(Seq[Any](/*3.4*/navbar/*3.10*/.render)),format.raw/*3.17*/("""

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3>
				Forums</br ><br />
			</h3>


<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">

			 <button type="button" class="btn btn-success" align="right">New Forum</button><br /><br />

		</div>
		<div class="col-md-6 column">


		</div>
		</div>
	</div>
</div>

	</div>


    <div class="row clearfix">
    <div class="col-md-12 column"></div>

      """),_display_(Seq[Any](/*34.8*/for(index <- 1 until (forumItems.size + 1)) yield /*34.51*/{_display_(Seq[Any](format.raw/*34.52*/("""

      """),_display_(Seq[Any](/*36.8*/if(index % 3 == 0)/*36.26*/{_display_(Seq[Any](format.raw/*36.27*/("""

            <div class="row">
      """)))})),format.raw/*39.8*/("""

      <div class="col-xs-4">
        <div class="thumbnail">
          <img src=""""),_display_(Seq[Any](/*43.22*/forumItems(index - 1)/*43.43*/.imageUrl)),format.raw/*43.52*/("""" width="400" height="400" />
          <div class="caption" width="400" height="400">
            <h3>
              """),_display_(Seq[Any](/*46.16*/forumItems(index - 1)/*46.37*/.topicHeader)),format.raw/*46.49*/("""
            </h3>
            <p>
              """),_display_(Seq[Any](/*49.16*/forumItems(index - 1)/*49.37*/.body)),format.raw/*49.42*/("""<br /><br /><br />
            </p>
            <p>
              <a class="btn btn-success" href=""""),_display_(Seq[Any](/*52.49*/routes/*52.55*/.Application.forumItem(forumItems(index - 1).forumId))),format.raw/*52.108*/("""">Read</a>
            </p>
          </div>
        </div>
      </div>

        """),_display_(Seq[Any](/*58.10*/if(index % 3 == 0 && index != 0)/*58.42*/{_display_(Seq[Any](format.raw/*58.43*/("""
        </div>
        """)))})),format.raw/*60.10*/("""
      """)))})),format.raw/*61.8*/("""
<!--
          <div class="row">

				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://blog.peertransfer.com/wp-content/uploads/2013/04/Biz-Finding-A-Job-May-Mean-Getting-More-Niche.jpg" width="400" height="400" />
						<div class="caption" width="400" height="400">
							<h3>
								How to Prepare for an Interview
							</h3>
							<p>
								Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.<br /><br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://usajobs.me/wp-content/uploads/2015/03/business-women-success.jpg" />
						<div class="caption" width="400" height="400">
							<h3>
								How to Get a Job With No Experience
							</h3>
							<p>
								Having no experience for a job of your choice will not necessarily eliminate you from being a good candidate. Your dedication, communication skills, and work ethic play a big role. However, in order to stand out you will need to follow a few rules and strategies.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://collegeinformations.com/wp-content/uploads/2012/05/choosing-a-major.jpg" />
						<div class="caption" width="400" height="400">
							<h3>
								5 Tips for Choosing the Right Major
							</h3>
							<p>
								They say choose your passion as your major and you will never have to work a day in your life. While this is true, there is more to knowing what major is right for you.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://blog.nextsociety.com/wp-content/uploads/2014/09/entrepreneurship-networking-advice-1.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								How to Grow your Network
							</h3>
							<p>
								Whether you want to grow your business or get an entry job position, networking is one of the many crucial factors which you should practice like any other skill to master it.<br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="https://media.licdn.com/mpr/mpr/p/8/005/081/32b/3e3556e.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								10 Steps to Starting a Business
							</h3>
							<p>
								Starting a business involves a lot of research, financial investment, and going through a series of legal work. These 10 steps can help you get your business started as well as prepare and manage your business.<br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://gomdl.com/wp-content/uploads/2013/03/Student-Studying.jpg"/>
						<div class="caption" width="400" height="400">
							<h3>
								Study Tips
							</h3>
							<p>
								Wondering why the all nighter before your final exam did not pay off and did not get you the grade you hoped for? Need to know how to study effectively? Then look no further. Any student can benefit from these tips and techniques.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://www.unomaha.edu/college-of-business-administration/finance-banking-real-estate/_files/images/finance1.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								Beginner's Guide to Managing Your Finances
							</h3>
							<p>
								Whether you want to admit it or not, money is a huge part of your life nowadays, thus knowing how to manage it will help you take controlof your life and get you ahead financially and socially.
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="http://higherperspective.com/wp-content/uploads/2014/12/Successful-Business-Risk.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								3 Ways to be More Successful
							</h3>
							<p>
								It's human nature to desire success no matter where they are in life. However, it's easier said than done, hence not a lot of people are willing to do what is necessary to reach success.<br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img src="https://venkyias.files.wordpress.com/2012/08/discussion1.jpg" width="400" height="400"/>
						<div class="caption" width="400" height="400">
							<h3>
								General Discussion
							</h3>
							<p>
								If you cannot find the forum looking for, you can either create your own forum or try this one. You can find a wide variety of topics and questions in this forum.<br /><br /><br /><br />
							</p>
							<p>
								<a class="btn btn-success" href="#">Read</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<br /><br />-->
		</div>
	</div>


""")))})),format.raw/*219.2*/("""
"""))}
    }
    
    def render(forumItems:List[Forum]): play.api.templates.HtmlFormat.Appendable = apply(forumItems)
    
    def f:((List[Forum]) => play.api.templates.HtmlFormat.Appendable) = (forumItems) => apply(forumItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 00:05:47 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/forum.scala.html
                    HASH: 7c3cc489a83a047f9cab00c9ca9eb7c9528999e0
                    MATRIX: 779->1|898->26|934->28|960->46|998->47|1036->51|1050->57|1078->64|1590->541|1649->584|1688->585|1732->594|1759->612|1798->613|1868->652|1988->736|2018->757|2049->766|2204->885|2234->906|2268->918|2354->968|2384->989|2411->994|2547->1094|2562->1100|2638->1153|2757->1236|2798->1268|2837->1269|2894->1294|2933->1302|8838->7175
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|62->34|62->34|62->34|64->36|64->36|64->36|67->39|71->43|71->43|71->43|74->46|74->46|74->46|77->49|77->49|77->49|80->52|80->52|80->52|86->58|86->58|86->58|88->60|89->61|247->219
                    -- GENERATED --
                */
            