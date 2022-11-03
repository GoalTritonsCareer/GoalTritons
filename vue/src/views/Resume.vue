<template xmlns="http://www.w3.org/1999/html">
  <div id="resumeTop">
    <h1>Resume / CV & Cover Letter</h1>
    <p id="opening">In this page, Goal Tritons will walk you through an
      important step of your job application process—Resume,
      CV, and Cover Letter building. For resume and the CV, we will explain the differences, and then we will break down
      the specific components for all of them. Let’s start!</p>

    <a id="resume-vs-cv"></a>

    <div>
      <h2>Resume vs. CV</h2>

      <img src="/resume/resumeVScv.svg" alt="resume VS. CV">

      <a id="resume-breakdown"></a>
    </div>

    <div >
      <a id="resume-components"></a>
      <h2>Resume Breakdown</h2>

      <div>

        <div id="resume-components" class="headerWithLink">
          <h3>Resume Components</h3>
          <div style="text-align: right">
            <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank">
              <p class ="link">Schedule Resume Edit Appointment</p>
              &nbsp;
              <img src="/arrow.png" width=22px style="vertical-align: middle" alt="arrow">
            </a>
          </div>
        </div>

        <div class="wrapper">
          <div class="one1">
            <img src="/resume/resumeCompHeader.png" width="493px" alt="header">
          </div>
          <div class="one2">
            <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          </div>
          <div class="one3">
            <p><span class="semi">Header:</span> <br>
            Contact Information <i>(e.g. email, phone ##, LinkedIn)</i></p>
          </div>

          <div class="two1">
            <img src="/resume/resumeCompSummary.png" width="493px" alt="summary">
          </div>
          <div class="two2">
            <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          </div>
          <div class="two3">
            <p><span class="semi">Summary</span><br>
            Summarize your greatest achievement/character traits.</p>
          </div>

          <div class="three1">
            <img src="/resume/resumeCompSkill.png" width="493px" alt="skill"> <br>
            <img src="/resume/resumeCompExperience.png" width="493px" alt="experience">
          </div>
          <div class="three2">
            <img src="/needle.svg" width="66px" height="20px" alt="------>"
                 style="margin-left: 17px; margin-right: 16px; margin-top: 2px"> <br><br><br>
            <img src="/needle.svg" width="66px" height="20px" alt="------>"
                 style="margin-left: 17px; margin-right: 16px; margin-top: 108px">
          </div>
          <div class="three3">
            <span class="semi">Skills</span>
            <p style="line-height: 141%">
              Include any <strong class="medium">position-related</strong> soft/hard skills/languages/certifications that
              can add to your competencies. <i>(e.g. front-end developer—“CSS, C++, Javascript, Problem Solving”.) </i><br>
              <i>See more examples under </i><i class="moreResLink" @click="$router.push('/resume#more-resources')">More Resources</i>.
            </p>
            <br><br><br>
            <span class="semi">Experience</span>
            <p style="line-height: 141%">
              Include any professional experience that can <strong class="medium">prove your qualifications</strong> for
              the position you are applying for. Start with the <strong class="medium">most relevant</strong> one. If
              you want to include projects, you can start another section by following the same template.
            </p>
          </div>

          <div class="four1">
            <img src="/resume/resumeCompEducation.png" width="493px" alt="education">
          </div>
          <div class="four2">
            <img src="/needle.svg" width="66px" height="20px" alt="------>"
                 style="margin-left: 17px; margin-right: 16px; margin-top: 2px"> <br>
            <img src="/needle.svg" width="66px" height="20px" alt="------>"
                 style="margin-left: 17px; margin-right: 16px; margin-top: 70px">
          </div>
          <div class="four3">
            <p><span class="semi">Education</span><br>
              Include school name/majors & minors/expected graduation date/awards or honors; include
              <strong class="medium"> GPA only if ≥ 3.5</strong>. </p>
            <p>
              <br> <span class="semi">Activities <i>(Optional)</i>:</span> only
              add if relevant to the position.
            </p>
          </div>
        </div>

<!--        <div class="resumecomp">-->
<!--          <img src="/resumeCompHeader.png" width="493px" alt="header">-->
<!--          <img src="/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
<!--          <p><strong>Header:</strong> <br>-->
<!--            Contact Information <i>(e.g. email, phone ##, LinkedIn)</i></p>-->
<!--        </div>-->

<!--        <div class="resumecomp">-->
<!--          <img src="/resumeCompSummary.png" width="493px" alt="summary">-->
<!--          <img src="/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
<!--          <p><strong>Summary</strong><br>-->
<!--            Summarize your greatest achievement/character traits.</p>-->
<!--        </div>-->

<!--        <div class="resumecomp">-->
<!--          <img src="/resumeCompEducation.png" width="493px" alt="education">-->
<!--          <img src="/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
<!--          <p><strong>Education</strong><br>-->
<!--            Include your School Name, Majors & Minors, Timeline, Expected Graduation Date, and GPA. </p>-->
<!--        </div>-->

<!--        <div class="resumecomp">-->
<!--          <img src="/resumeCompExperience.png" width="493px"  alt="experience">-->
<!--          <img src="/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
<!--          <p><strong>Experience</strong><br>-->
<!--            Include any professional experience that can <strong class="semi">prove your qualifications</strong> for the-->
<!--            position you are applying for. Start with the <strong class="semi">most relevant</strong> one. If you want-->
<!--            to include projects, you can start another section by following the same template.</p>-->
<!--        </div>-->

<!--        <div class="resumecomp" style="margin-bottom: 0px">-->
<!--          <img src="/resumeCompSkill.png" width="493px" alt="skill">-->
<!--          <img src="/needle.svg" width="66px" height="20px" alt="&#45;&#45;&#45;&#45;&ndash;&gt;" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">-->
<!--          <p class="compTitle"><strong>Skills & Activities</strong> <br>-->
<!--            Include any <strong class="semi">position-related</strong> soft/hard skills/languages/certification that-->
<!--            can add to your competencies. </p>-->
<!--        </div>-->
<!--&lt;!&ndash;        Unfortunately, 此行超出了图片高度，待resume板块正式确认后再决定如何排版&ndash;&gt;-->
<!--        <div style="padding-left:calc(493px + 17px + 66px + 16px); text-align:left; margin-bottom:7px; margin-top:-1px">-->
<!--          <i>See examples under </i>-->
<!--          <i class="moreResLink" @click="$router.push('/resume#more-resources')">More Resources</i>-->
<!--        </div>-->

        <div class="buttondiv">
          <a id="resume-essentials"></a>
          <a href="/resume/resumetemplate.docx" download=""><button class="downloadTemplate">Download Template</button></a>
        </div>

      </div>

      <h3>Resume Essentials</h3>

      <img src="/resume/resumeEssentials.svg" style="margin-bottom: 60px" alt="resumeEssentials">
<!--      <img src="/resumeFormatTip.svg" width="" style="margin-top: 40px">-->
      <div style="position: relative; display: inline-block">
        <div style="background-color: rgba(244,206,113,0.21); border-radius: 1rem;border: 3px dashed #F4CE71; width:625px;
                    font-size: 16px; margin-left: -3%">
          <p style="padding-top: 10px; color: #1E4460">Limit formatting of your resume to be
            <a class="link" href="https://www.topresume.com/career-advice/what-is-an-ats-resume" target="_blank" style="color: #0467B0">
              ATS <i>(Applicant Tracking System)</i>
            </a>
            friendly.
          </p>
          <ul style="margin-left: 4vw; margin-right: 0;padding-bottom: 10px; color: #1E4460">
            <li>Fonts should be simple & readable</li>
            <li>Sections should be easily identified</li>
            <li>Titles and bodies should be distinguished with different weights</li>
          </ul>
        </div>
        <img style="position: absolute; top: -28px; left: 570px; z-index: 2; display: inline" src="/light-bulb.svg"
        alt="light-bulb">
      </div>

      <a id="sample-resumes-anchor" style="display: inline"></a>
      <div id="sample-resumes">
        <div class="headerWithLink" id="resumeComponentHeader">
          <h3>Sample Resumes</h3>
        </div>
        <div class="resumeTemplate">
          <p class="sampleResumeTitle">Econ/Business</p>
          <a class="card" href="//www.indeed.com/career-advice/resume-samples/business-resumes?from=careeradvice-US" target="_blank" style="margin-top: 5px">
            <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" height="255px">
            <img src="/resume/hoverImage.png" class="img-top" alt="click to view" height="255px">
          </a>
        </div>

        <div class="resumeTemplate">
          <p class="sampleResumeTitle">Info Tech <i>(IT)</i></p>
          <a class="card" href="//www.indeed.com/career-advice/resume-samples/information-technology-resumes?from=careeradvice-US" target="_blank" style="margin-top: 5px">
            <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" height="255px">
            <img src="/resume/hoverImage.png" class="img-top" alt="click to view" height="255px">
          </a>
        </div>
        <div class="resumeTemplate">
          <p class="sampleResumeTitle">Engineering</p>
          <a class="card" href="//www.indeed.com/career-advice/resume-samples/engineering-resumes?from=careeradvice-US" target="_blank" style="margin-top: 5px">
            <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" height="255px">
            <img src="/resume/hoverImage.png" class="img-top" alt="click to view" height="255px">
          </a>
        </div>
        <div class="resumeTemplate">
          <p class="sampleResumeTitle" >Art/Design</p>
          <a class="card" href="//www.indeed.com/career-advice/resume-samples/arts-resumes" target="_blank" style="margin-top: 5px" >
            <img src="/resume/resumeTemplateView.png" class="img-bot" alt="resume template" height="255px">
            <img src="/resume/hoverImage.png" class="img-top" alt="click to view" height="255px" >
            <p id="polish-resume" style="display:inline;"></p>
          </a>

        </div>

      </div>

      <div style="text-align: right">
        <a href="//zety.com/resume-examples" target="_blank">
          <p class ="link">See Samples for More Fields</p>
          &nbsp;
          <img src="/arrow.png" width=22px style="vertical-align: middle" alt="arrow">
        </a>
      </div>

      <div >
        <h3 style="margin-top: 80px">Polish Your Resume</h3>
        <p class="inlinePara" style="text-align: left">Carefully select a
          <strong class="semi">strong Action Verb</strong> per bullet point to demonstrate your accomplishments & skills.
          <br> &nbsp; &nbsp; <b style="font-weight: 900">•</b> <i>e.g. <span
              class="semi">managed</span> the cross-functional team</i>
        </p>
        <div id="polishVerbs">
          <dl>
            <dt>Management<br>
              Skills</dt>
            <dd>Administered</dd>
            <dd>Analyzed</dd>
            <dd>Assigned</dd>
            <dd>Attained</dd>
            <dd>Chaired</dd>
            <dd>Consolidate</dd>
            <dd>Contracted</dd>
            <dd>Coordinated</dd>
            <dd>Delegated</dd>
            <dd>Directed</dd>
            <dd>Evaluated</dd>
            <dd>Executed</dd>
            <dd>Improved</dd>
            <dd>Increased</dd>
            <dd>Managed</dd>
            <dd>Monitored</dd>
            <dd>Organized</dd>
            <dd>Oversaw</dd>
            <dd>Planned</dd>
            <dd>Prioritized</dd>
            <dd>Produced</dd>
            <dd>Recommended</dd>
            <dd>Reviewed</dd>
            <dd>Scheduled</dd>
            <dd>Strengthened</dd>
            <dd>Supervise</dd>
          </dl>

          <dl>
            <dt>Communication<br>
              Skills</dt>
            <dd>Arbitrated</dd>
            <dd>Arranged</dd>
            <dd>Authored</dd>
            <dd>Collaborated</dd>
            <dd>Communicated</dd>
            <dd>Convinced</dd>
            <dd>Corresponded</dd>
            <dd>Developed</dd>
            <dd>Directed</dd>
            <dd>Drafted</dd>
            <dd>Edited</dd>
            <dd>Educated</dd>
            <dd>Enlisted</dd>
            <dd>Formulated</dd>
            <dd>Informed</dd>
            <dd>Influenced</dd>
            <dd>Interpreted</dd>
            <dd>Mediated</dd>
            <dd>Negotiated</dd>
            <dd>Persuaded</dd>
            <dd>Promoted</dd>
            <dd>Publicized</dd>
            <dd>Reconciled</dd>
            <dd>Recruited</dd>
            <dd>Translated</dd>
            <dd>Wrote</dd>
          </dl>

          <dl>
            <dt>Teaching<br>
              Skills</dt>
            <dd>Adapted</dd>
            <dd>Advised</dd>
            <dd>Clarified</dd>
            <dd>Coached</dd>
            <dd>Communicated</dd>
            <dd>Coordinated</dd>
            <dd>Developed</dd>
            <dd>Educated</dd>
            <dd>Enabled</dd>
            <dd>Encouraged</dd>
            <dd>Evaluated</dd>
            <dd>Explained</dd>
            <dd>Facilitated</dd>
            <dd>Guided</dd>
            <dd>Informed</dd>
            <dd>Inspired</dd>
            <dd>Instructed</dd>
            <dd>Motivated</dd>
            <dd>Persuaded</dd>
            <dd>Set goals</dd>
            <dd>Trained</dd>
          </dl>
          <dl>
            <dt>Creative<br>
              Skills</dt>
            <dd>Conceptualized</dd>
            <dd>Created</dd>
            <dd>Coordinated</dd>
            <dd>Customized</dd>
            <dd>Designed</dd>
            <dd>Developed</dd>
            <dd>Directed</dd>
            <dd>Fashioned</dd>
            <dd>Illustrated</dd>
            <dd>Initiated</dd>
            <dd>Inspire</dd>
            <dd>Integrated</dd>
            <dd>Introduced</dd>
            <dd>Invented</dd>
            <dd>Originated</dd>
            <dd>Performed</dd>
            <dd>Planned</dd>
            <dd>Revitalized</dd>
            <dd>Shaped</dd>
          </dl>
          <dl>
            <dt>Administrative<br>
              Skills</dt>
            <dd>Arranged</dd>
            <dd>Catalogued</dd>
            <dd>Classified</dd>
            <dd>Collected</dd>
            <dd>Compiled</dd>
            <dd>Executed</dd>
            <dd>Generated</dd>
            <dd>Implemented</dd>
            <dd>Inspected</dd>
            <dd>Monitored</dd>
            <dd>Operated</dd>
            <dd>Organized</dd>
            <dd>Prepared</dd>
            <dd>Processed</dd>
            <dd>Purchased</dd>
            <dd>Recorded</dd>
            <dd>Retrieved</dd>
            <dd>Screened</dd>
            <dd>Specified</dd>
            <dd>Systemized</dd>
            <dd>Validated</dd>
          </dl>

          <dl>
            <dt>Research<br>
              Skills</dt>
            <dd>Analyzed</dd>
            <dd>Assessed</dd>
            <dd>Clarified</dd>
            <dd>Collected</dd>
            <dd>Critiqued</dd>
            <dd>Diagnosed</dd>
            <dd>Evaluated</dd>
            <dd>Examined</dd>
            <dd>Extracted</dd>
            <dd>Identified</dd>
            <dd>Inspected</dd>
            <dd>Interpreted</dd>
            <dd>Interviewed</dd>
            <dd>Investigated</dd>
            <dd>Organized</dd>
            <dd>Reviewed</dd>
            <dd>Surveyed</dd>
            <dd>Systematized</dd>
          </dl>

          <dl>
            <dt>Technical<br>
              Skills</dt>
            <dd>Assembled</dd>
            <dd>Calculated</dd>
            <dd>Computed</dd>
            <dd>Designed</dd>
            <dd>Developed</dd>
            <dd>Devised</dd>
            <dd>Engineered</dd>
            <dd>Experimented</dd>
            <dd>Fabricated</dd>
            <dd>Maintained</dd>
            <dd>Operated</dd>
            <dd>Programmed</dd>
            <dd>Remodeled</dd>
            <dd>Repaired</dd>
            <dd>Solved</dd>
            <dd>Tested</dd>
            <dd>Upgraded</dd>
          </dl>

          <dl>
            <dt>Financial<br>
              Skills</dt>
            <dd>Administered</dd>
            <dd>Allocated</dd>
            <dd>Analyzed</dd>
            <dd>Appraised</dd>
            <dd>Audited</dd>
            <dd>Balanced</dd>
            <dd>Budgeted</dd>
            <dd>Calculated</dd>
            <dd>Computed</dd>
            <dd>Developed</dd>
            <dd>Forecasted</dd>
            <dd>Managed</dd>
            <dd>Marketed</dd>
            <dd>Planned</dd>
            <dd>Researched</dd>
          </dl>

          <dl>
            <dt>Helping<br>
              Skills</dt>
            <dd>Assessed</dd>
            <dd>Assisted</dd>
            <dd>Clarified</dd>
            <dd>Coached</dd>
            <dd>Counseled</dd>
            <dd>Demonstrated</dd>
            <dd>Diagnosed</dd>
            <dd>Educated</dd>
            <dd>Expedited</dd>
            <dd>Facilitated</dd>
            <dd>Familiarized</dd>
            <dd>Guided</dd>
            <dd>Motivated</dd>
            <dd>Referred</dd>
            <dd>Represented</dd>
          </dl>

          <dl style="width: 105px">
            <dt>Demonstrating<br>
              Accomplishment</dt>
            <dd>Achieved</dd>
            <dd>Expanded</dd>
            <dd>Founded</dd>
            <dd>Improved</dd>
            <dd>Pioneered</dd>
            <dd>Reduced</dd>
            <dd>Resolved</dd>
            <dd>Restored</dd>
            <dd>Spearheaded</dd>
            <dd>Transformed</dd>
          </dl>
        </div>
        <a id="impactStatements"></a>
        <br>

        <p class="inlinePara" style="text-align: left">Make sure you have <strong class="semi">Impact Statements</strong>
          to show your accomplishments:</p>
        <img src="/resume/impactStatement.svg" width="80%" alt="impactStatement">


        <p class="ulTitle" style="margin-top: 50px">Example:</p>
        <ul>
          <li> <i>Oversaw <strong class="semi" style="color: #1E4460">(verb in past tense)</strong> a team of 10
            volunteers in planning, preparing, and promoting a charity table quiz <strong class="semi" style="color: #1E4460">
              (description of the work)</strong> which raised 15% <strong class="semi" style="color: #1E4460">
              (quantified impact)</strong>of the total revenue.</i></li>
        </ul>
        <br>
        <p class="ulTitle">Sample Sentence Structures:</p>
        <ul>
          <li>Launched xxx in xxx, resulting in xxx.</li>
          <li>Developed xxx in xxx, helped/raised/changed xxx.</li>
          <li>Analyzed xxx and created xxx to present to xxx at weekly meetings.</li>
          <li>Launched xxx in xxx, resulting in xxx.</li>
          <li>Implemented a new xxx system that streamlined the xxx and allowed xxx to be more efficient.</li>
          <li>Coordinated with the xxx team to form a xxx group for xxx that resulted in xxx.</li>
        </ul>

        <a id="cv-breakdown"></a>
      </div>

    </div>

    <div >
      <h2>CV Breakdown</h2>

      <div>
        <div class="headerWithLink">
          <h3 id="cv-components">CV Components</h3>
          <div style="text-align: right">
            <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank">
              <p class ="link">Schedule CV Edit Appointment</p>
              &nbsp;
              <img src="/arrow.png" width=22px style="vertical-align: middle" alt="arrow">
            </a>
          </div>

        </div>
        <h3 class="resumecomp" style="margin-bottom: 20px">Appendix 1: Example Undergraduate <br>Curriculum Vitae</h3>

        <div class="resumecomp">
          <img src="/resume/cvHeader.png" width="483px" alt="cvHeader">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <b class="semi">Header</b>
            <p class="components">Besides your contact information, you can include your
              website or profile if you have one.</p>
          </div>
        </div>

        <div class="resumecomp" >
          <img src="/resume/cvEducation.png" width="483px" alt="cvEducation">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Education</span>
            <p class="components">Besides any general information, you can include the title
              and the names of your thesis advisers if you are writing a department thesis. </p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvResearchInterests.png" width="483px" alt="cvResearchInterests">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Research Interest</span><br>
            <p class="components">Briefly elaborate on your research interest/goal.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvResearchAppointments.png" width="483px" alt="cvResearchAppointments">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Research Appointments</span>
            <p class="components">Include the time, the position you held, the name of the lab/department/
              institution/director, and the location.</p>
          </div>
        </div>

        <div class="resumecomp">
          <img src="/resume/cvScholarships.png" width="483px" alt="cvScholarships">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Grants/Awards/Academic Honors/Scholarships</span>
            <p class="components">Include the award name, award-granting institution, and year of the award.</p>
          </div>
        </div>

        <div class="resumecomp" >
          <img src="/resume/cvPopularArticles.png" width="483px" alt="cvPopularArticles">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Popular Articles or Publications</span>
            <p class="components">Include scholarly publications such as journals, articles, and book chapters, as well
              as the status of their publication <i>(e.g. in preparation, under
                review, forthcoming)</i>.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvResearchSkills.png" width="483px" alt="cvResearchSkills">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Research Skills/Experience</span>
            <p class="components">
              Briefly describe your role, the primary methods used, and key findings.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvService.png" width="483px" alt="cvService">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Leadership/Activities/Service/Volunteer</span>
            <p class="components">
              Briefly describe your role and accomplishments. Include the organization, your position title, the location,
              and the timeline.</p>
          </div>
        </div>

        <div class="resumecomp" style="margin-bottom: 10px">
          <img src="/resume/cvImportantCoursesTaken.png" width="483px" alt="cvImportantCoursesTaken">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Courses Taken</span>
            <p class="components">
              Include relevant coursework and your GPA if ≥ 3.5.</p>
          </div>
        </div>

        <div class="resumecomp">
          <img src="/resume/cvReferences.png" width="483px" alt="cvReferences">
          <img src="/needle.svg" width="66px" height="20px" alt="------>" style="margin-left: 17px; margin-right: 16px; margin-top: 2px">
          <div style="text-align: left; width: 545px">
            <span class="semi">Reference</span>
            <p class="components">
              Include relevant references, their name, title, institution, and contact information.</p>
          </div>
        </div>

        <p class="ulTitle" style="margin-top: 50px">More Sections to Include
          <i>(if you have one & relevant to your
            respective field)</i></p>
        <br>
        <ul>
          <li><span class="medium">Presentations</span>: include the
            author<i>(s)</i> and the title of presentation, the
            conference/symposium name,
            the location and the date. </li>
          <li><span class="medium">Teaching Experience</span>: describe your role; include the name of the course and institution, the position
            you held <i>(e.g., Teaching Assistant, Instructor of Record)</i>,
            the location, and month-year range of the
            teaching engagement.</li>
          <li class="medium">Professional Memberships or Affiliations</li>
          <li class="medium">Certifications & Licensure</li>
          <li class="medium">Skills</li>
        </ul>

        <p class="ulTitle" style="margin-top: 20px; font-weight: 400"><i>See more CV formatting examples under </i>
          <i class="moreResLink" @click="$router.push('/resume#more-resources')">More Resources</i>
        </p>

        <div class="buttondiv">
          <a href="/resume/cvTemplate.pdf" download=""><button class="downloadTemplate">Download Template</button></a>
          <a id="cover-letter"></a>
        </div>

      </div>
    </div>


    <div>
      <h2>Cover Letter Breakdown</h2>

      <div>
        <div class="headerWithLink">
          <h3>Cover Letter Components</h3>
          <div style="text-align: right">
            <a href="//ucsd.joinhandshake.com/stu/appointments/new" target="_blank">
              <p class ="link">Schedule Cover Letter Edit Appointment</p>
              &nbsp;
              <img src="/arrow.png" width=22px style="vertical-align: middle" alt="arrow">
            </a>
          </div>

        </div>
        <img src="/resume/coverLetter.svg" width="890px" alt="coverLetter">

        <div class="buttondiv">
          <a href="/resume/coverLetterTemplate.pdf" download><button class="downloadTemplate">Download Template</button></a>
          <a id="more-resources"></a>
        </div>

      </div>
    </div>


    <div >
      <h2>More Resources</h2>

      <p class="moreResTitle">Resume:</p>
      <ul>
        <li> Free Online Resume Builder:
          <ul style="margin-left: 23px">
            <li><a href="//www.resume.com/" target="_blank"><p class="moreRes">
              Free Resume Builder | Resume.com</p></a></li>
            <li><a href="https://www.rezi.ai/" target="_blank"><p class="moreRes">
              The AI Resume Builder | Rezi</p></a></li>
          </ul>
        </li>
        <li>Resume Summary Examples: <a href="//zety.com/blog/resume-summary#:~:text=Here's%20how%20to%20write%20a,can%20deliver%20results%20when%20hired" target="_blank">
          <p class="moreRes" style="display: inline"> Professional Resume
            Summary Examples <i>(25+ Statements)</i></p></a>
        </li>
        <li>Resume Skills Examples: <a href="//resumegenius.com/blog/resume-help/skills-for-resume" target="_blank">
          <p class="moreRes" style="display: inline">Best Skills for Your
            Resume <i>(Examples + How to List)</i></p></a>
        </li>
        <li>Career Center: <a href="https://career.ucsd.edu/succeed-search/resume/index.html" target="_blank">
          <p class="moreRes" style="display: inline">Create a Resume</p></a>
        </li>
      </ul>

      <p class="moreResTitle" style="margin-top: 20px">CV:</p>
      <ul>
        <li>More examples for CV formatting: <a href="//resumegenius.com/blog/cv-help/cv-format#conferences" target="_blank">
          <p class="moreRes" style="display: inline">Curriculum Vitae <i>(CV)
          </i> Format: Samples & Formatting Tips</p></a>
        </li>
      </ul>

      <p class="moreResTitle" style="margin-top: 20px">Cover Letter:</p>
      <ul>
        <li>Paraphrasing Tool: <a href="//quillbot.com/" target="_blank">
          <p class="moreRes" style="display: inline">Paraphrasing Tool</p></a>
        </li>
      </ul>

      <p class="moreResTitle" style="margin-top: 20px">More Articles for tips:</p>
      <ul>
        <li><a href="//www.themuse.com/advice/how-to-quantify-your-resume-bullets-when-you-dont-work-with-numbers" target="_blank">
          <p class="moreRes" style="display: inline">Tips on quantifying your accomplishments</p></a>
        </li>
        <li><a href="//www.themuse.com/advice/4-ways-to-make-sure-your-resume-is-selling-you-as-the-one-for-the-job" target="_blank">
          <p class="moreRes">4 Ways to Make Sure Your Resume Is Selling You as the One for the Job</p></a>
        </li>
      </ul>
    </div>

  </div>
</template>
<style>
</style>
<script>
export default {
  name: "Resume"
}
</script>

<style scoped>
@font-face { font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
}
.semi {
  font-weight: 600;
}
.medium {
  font-weight: 500;
}
/*.scrollbar-demo-item {*/
/*  display: flex;*/
/*  align-items: center;*/
/*  justify-content: center;*/
/*  height: 50px;*/
/*  margin: 10px;*/
/*  text-align: center;*/
/*  border-radius: 4px;*/
/*  background: var(--el-color-primary-light-9);*/
/*  color: var(--el-color-primary);*/
/*}*/
.downloadTemplate{
  font-style: normal;
  font-weight: 600;
  font-size: 16px;
  width: 220px;
  height: 40px;
  border-radius: 0.5rem;
  padding: 0.5rem 1rem;
  background-color: #1E4460;
  border: hidden;
  margin-top: 50px;
  color: white;
  box-shadow: 0 4px 4px rgb(30 68 96 / 0.25);
}
.downloadTemplate:hover{
  background-color: #F4CE71;
  color: darkblue;
  border: hidden;
}
a{
  color: #1E4460;
  text-decoration: none;
}
.link {
  display: inline;
  text-decoration: none;
  color: #1E4460;
  font-weight: 500;
}
.link:hover {
  text-decoration: underline;
  font-weight: 600;
}
.moreRes{
  background-image: linear-gradient(
      to right,
      #0467B0,
      #0467B0
  );
  background-size: 200% 100%;
  background-position: -100%;
  display: inline-block;
  padding: 2px 0;
  position: relative;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  transition: all 0.3s ease-in-out;
  font-weight: 500;
}
.moreRes::before {
  content: '';
  background: #0467B0;
  display: block;
  position: absolute;
  bottom: -3px;
  left: 0;
  width: 0;
  height: 2px;
  transition: all 0.3s ease-in-out;
}
.moreRes:hover {
  background-position: 0;
  font-weight: 600;
}
.moreRes:hover::before {
  width: 100%;
}
.moreResLink {
  color: #B27224;
  font-weight: 500;
}
.moreResLink:hover {
  font-weight: 600;
  text-decoration: underline;
}
div{
  text-align: center;
}
h1,h2,h3{
  text-align: left;
}
.buttondiv{
  text-align: right;
  margin-bottom: 82px;
}
.resumecomp{
  display: flex;
  text-align: left;
  margin-bottom: 7px;
}
h1{
  margin-bottom: 100px;
  color: #1E4460;
  font-weight: 700;
  font-size: 28px;
  font-family: work-sans;
}
h2{
  font-family: work-sans;
  font-style: normal;
  font-size: 20px;
  font-weight: 700;
  color: #182B49;
  margin-bottom: 82px;
  margin-top: 95px;
  border-top: 1px solid black;
  border-bottom: 1px solid black;
  padding-top: 15px;
  padding-bottom: 15px;
}
h3{
  margin-bottom: 50px;
  font-weight: 700;
  font-size: 16px;
  font-style: normal;
}
#sample-resumes a{
  margin-right: 50px;
}
#opening{
  font-size: 16px;
  font-style: normal;
  font-weight: 400;
  line-height: 141%;
  text-align: left;
  margin-right: 11vw;
  margin-left: 11vw;
}
.inlinePara{
  margin-bottom: 20px;
  margin-top: 50px;
  padding-left: 3.6vw;
}
ul{
  text-align: left;
  margin-right: 12vw;
  margin-left: 12vw;
  font-size: 16px;
  font-weight: 400;
  font-style: normal;
  line-height: 141%;    /* list里的行间宽度为141%，其他为default */
}
.ulTitle{
  font-size: 16px;
  font-weight: 600;
  font-style: normal;
  text-align: left;
  margin-left: 10vw;
  margin-bottom: 0;
}
.moreResTitle{
  font-size: 16px;
  font-weight: 500;
  font-style: normal;
  text-align: left;
  margin-left: 10vw;
  margin-bottom: 0;
}
.headerWithLink{
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
}
.card {
  position: relative;
  display: inline-block;
  margin: 50px;
}
.card .img-top {
  display: none;
  position: absolute;
  top: 0;
  left: 0;
  z-index: 2;
}
.card:hover .img-top {
  display: inline;
}
.img-bot {
  box-shadow: 0 4px 4px rgb(0 0 0 / 0.25);
}
#sample-resumes{
  display: grid;
  grid-auto-rows: auto auto;
  grid-template-columns: repeat(4, 1fr);
}
.resumeTemplate{
  grid-row: 2;
}
.components {
  line-height: 141%;
}
#resumeComponentHeader{
  grid-column-start: 1;
  grid-column-end: span 4;
  margin-top: 82px;
}
.sampleResumeTitle{
  font-size: 16px;
  font-weight: 550;
  font-style: normal;
  border-radius: 1rem;
  border: 1px solid black;
  margin: auto;
  width: 185px;
  background-color: #1E4460;
  color: #F4CE71;
}
#polishVerbs{
  display: flex;
  text-align: center;
  margin: auto;
  width: 68vw;
}
#polishVerbs dl{
  border: 1px solid #e0ac79;
  margin-right: 10px;
  width: 100px;
  text-align: left;
}
#polishVerbs dt{
  text-align: center;
  font-size: 13px;
  border-bottom: 1px solid black;
  background-color: #F4CE71;
}
#polishVerbs dd{
  padding-left: 2px;
  font-size: 12px;
}

.wrapper {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 0;
  height: fit-content;
  width: min-content;
}
.one1 {
  grid-column: 1;
  grid-row: 1;
}
.one2 {
  grid-column: 2;
  grid-row: 1;
  width: 100px;
}
.one3 {
  grid-column: 3;
  grid-row: 1;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}
.two1 {
  grid-column: 1;
  grid-row: 2;
}
.two2 {
  grid-column: 2;
  grid-row: 2;
  width: 100px;
}
.two3 {
  grid-column: 3;
  grid-row: 2;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}
.three1 {
  grid-column: 1;
  grid-row: 3;
}
.three2 {
  grid-column: 2;
  grid-row: 3;
  width: 100px;
}
.three3 {
  grid-column: 3;
  grid-row: 3;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}
.four1 {
  grid-column: 1;
  grid-row: 4;
}
.four2 {
  grid-column: 2;
  grid-row: 4;
  width: 100px;
}
.four3 {
  grid-column: 3;
  grid-row: 4;
  /*width: calc(77vw - 600px);*/
  width: 500px;
  text-align: left;
}

</style>