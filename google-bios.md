---
layout: page
title: Google Virtual TA Bios
description: Biographies for the virtual Google TAs.
nav_exclude: true
---

# Google Virtual TA Bios

<!-- Staff information is stored in the `_staffers` directory and rendered according to the layout file, `_layouts/staffer.html`. -->

<!-- ## Instructors

{% assign instructors = site.staffers | where: 'role', 'Instructor' %}
{% for staffer in instructors %}
{{ staffer }}
{% endfor %}

{% assign teaching_assistants = site.staffers | where: 'role', 'Teaching Assistant' %}
{% assign num_teaching_assistants = teaching_assistants | size %}
{% if num_teaching_assistants != 0 %}
## Teaching Assistants

{% for staffer in teaching_assistants %}
{{ staffer }}
{% endfor %}
{% endif %} -->

{% assign googlers = site.staffers | where: 'role', 'Googler' %}

{% for staffer in googlers %}
{{ staffer }}
{% endfor %}
